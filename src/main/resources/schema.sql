DROP TABLE IF EXISTS movie;

CREATE TABLE movie (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  pays VARCHAR(250) NOT NULL,
  category VARCHAR(250) DEFAULT NULL,
  description VARCHAR(3000) DEFAULT NULL,
  release_date DATE DEFAULT NULL,
  up_vote int default null,
  down_vote int default null
);


CREATE TABLE manifeste
(
    id INT AUTO_INCREMENT  PRIMARY KEY,
    annee integer,
    bureau_enregistrement character varying(35) ,
    code_lieu_chargement character varying(6) ,
    code_lieu_departmt character varying(6) ,
    code_lieu_destination character varying(6) ,
    code_nationalitemt character varying(4) ,
    code_type_manifeste integer,
    companie_transport character varying(256) ,
    conducteur character varying(256) ,
    consignataire character varying(256) ,
    date_arrivee timestamp without time zone,
    date_embarquement timestamp without time zone,
    date_enreg_entete timestamp without time zone,
    date_enregistrement timestamp without time zone,
    date_enregistrementmt timestamp without time zone,
    description_moyen_transport character varying(256) ,
    jauge_brute double precision,
    jauge_nette double precision,
    libelle_bureau_enreg character varying(256) ,
    lieu_chargement character varying(256) ,
    lieu_departmt character varying(256) ,
    lieu_destination character varying(256) ,
    moyen_transport character varying(35) ,
    nationalite character varying(256) ,
    nature_manifeste character varying(35) ,
    nombre_colis integer,
    nombre_lignes integer,
    nombrett integer,
    nombre_unite_de_charge integer,
    num_enregmt character varying(35) ,
    numero_enreg character varying(35) ,
    numero_repertoire character varying(35) ,
    numero_seq_rep integer,
    numero_vol_voyage character varying(25) ,
    poids_brut_marchandise double precision,
    statut character varying(35) ,
    type_manifeste character varying(35) ,
    type_navire character varying(256) 
);
