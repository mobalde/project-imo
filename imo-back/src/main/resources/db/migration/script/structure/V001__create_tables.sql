-- create schema
CREATE SCHEMA IF NOT EXISTS public;

-- create table users
create table IF NOT EXISTS users(
    id BIGSERIAL NOT NULL,
    create_at timestamp without time zone,
    update_at timestamp without time zone,
    modificationcounter integer,
    email varchar(500) CONSTRAINT email_unique UNIQUE,
    password varchar(500),
    enabled boolean,
    user_type varchar(100),
    PRIMARY KEY(id)
);

-- create table role
create table IF NOT EXISTS role(
    id BIGSERIAL NOT NULL,
    create_at timestamp without time zone,
    update_at timestamp without time zone,
    modificationcounter integer,
    role varchar(60) not null CONSTRAINT role_unique UNIQUE,
    PRIMARY KEY(id)
);

-- create table user_roles
create table IF NOT EXISTS user_roles(
    user_id BIGSERIAL NOT NULL,
    role_id BIGSERIAL NOT NULL,
    PRIMARY KEY(user_id,role_id)
);

-- create user_moral
create table IF NOT EXISTS user_moral(
    kbis text,
    raison_social text,
    code_postal varchar(8),
    ville text not null,
    pays text not null,
    complement_adresse text,
    libelle_rue varchar(70),
    numero_rue varchar(5),
    poste_occupe varchar(100),
    prenom varchar(50) not null,
    nom varchar(50) not null,
    telephone varchar(15),
    type_promoteur varchar(12) not null,
    siret varchar(20)
)INHERITS(users);

-- create table user_physique
create table IF NOT EXISTS user_physique(
    code_postal varchar(8),
    ville text not null,
    pays text not null,
    complement_adresse text,
    libelle_rue varchar(70),
    numero_rue varchar(5),
    poste_occupe varchar(100),
    prenom varchar(50) not null,
    nom varchar(50) not null,
    telephone varchar(15),
    sexe varchar(2) not null
)INHERITS(users);

-- contraintes
Alter table user_roles add CONSTRAINT fk_user_roles FOREIGN KEY(user_id) REFERENCES users(id);
Alter table user_roles add CONSTRAINT fk_role_user FOREIGN KEY(role_id) REFERENCES role(id);

insert into role (id,modificationcounter, role) values (1, 0, 'ADMIN'),(2, 0, 'USER_MORAL'),(3, 0, 'USER_PHYSIQUE') ON CONFLICT (role) DO NOTHING;