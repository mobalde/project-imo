/**
 * 
 */
package imo.com.logic.utilisateur;

import org.apache.commons.lang3.StringUtils;

import imo.com.logic.utilisateur.moral.dto.UserMoralDto;
import imo.com.logic.utilisateur.physique.dto.UserPhysiqueDto;
import imo.com.model.adresse.Adresse;
import imo.com.model.promoteur.RepresentantLegal;
import imo.com.response.ImoResponse;

/**
 * @author mbalde
 *
 */
public abstract class CheckFieldsUser {

    /**
     * check object adresse
     * 
     * @param adresse
     *                Adresse
     * @return message
     */
    private static String checkAdresse(Adresse adresse) {
        String message = "";
        if (adresse == null) {
            message += "pays ville ";
        } else if (adresse != null) {
            if (StringUtils.isBlank(adresse.getPays())) {
                message += "pays";
            } else if (!"Guinee".equals(adresse.getPays())) {
                // verification rue, numero et code postal
                if (StringUtils.isBlank(adresse.getNumeroRue())) {
                    message += "numeroRue ";
                }
                if (StringUtils.isBlank(adresse.getLibelleRue())) {
                    message += "libelleRue ";
                }
                if (StringUtils.isBlank(adresse.getCodePostal())) {
                    message += "codePostal ";
                }
            }
            if (adresse.getVille() == null) {
                message += "ville ";
            }
        }
        return message;
    }

    /**
     * verification des champs non nullable
     * 
     * @param dto
     *                    userPhysique
     * @param imoResponse
     * @return boolean
     */
    public static boolean checkObjectDto(Object dto, ImoResponse<UserPhysiqueDto> imoResponse) {

        String champsObligatoires = "";
        if (dto instanceof UserPhysiqueDto) {
            if (((UserPhysiqueDto) dto).getSexe() == null) {
                champsObligatoires += "sexe ";
            }
            champsObligatoires += checkRepresentantLegal(((UserPhysiqueDto) dto).getRepresentantLegal());
            champsObligatoires += checkAdresse(((UserPhysiqueDto) dto).getAdresse());
        }
        // champs communs
        if (dto instanceof UserMoralDto) {
            champsObligatoires += checkRepresentantLegal(((UserMoralDto) dto).getRepresentantLegal());
            champsObligatoires += checkAdresse(((UserMoralDto) dto).getAdresse());
        }
        if (StringUtils.isBlank(((UserDto) dto).getEmail())) {
            champsObligatoires += "email ";
        }
        if (StringUtils.isBlank(((UserDto) dto).getPassword())) {
            champsObligatoires += "password ";
        }
        // Traitement resultat
        if (!StringUtils.isBlank(champsObligatoires)) {
            imoResponse.setChampsObligatoires(champsObligatoires.split(" "));
            return true;
        }
        return false;
    }

    /**
     * check object representant legal
     * 
     * @param repL
     *             Representant legal
     * @return message
     */
    private static String checkRepresentantLegal(RepresentantLegal repL) {
        String message = "";
        if (repL == null) {
            message += "nom prenom ";
        } else if (repL != null) {
            if (StringUtils.isBlank(repL.getNom())) {
                message += "nom ";
            }
            if (StringUtils.isBlank(repL.getPrenom())) {
                message += "prenom ";
            }
        }
        return message;
    }

}
