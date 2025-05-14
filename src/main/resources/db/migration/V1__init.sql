CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE TB_USUARIO (

    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    nome_usuario VARCHAR(100) NOT NULL,
    data_nascimento DATE NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL

);


CREATE TABLE TB_HISTORIA (

    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    titulo VARCHAR(100) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    genero_enum VARCHAR(20),
    status_enum VARCHAR(20),
    criado_em TIMESTAMP DEFAULT NOW()

);


CREATE TABLE TB_COMENTARIO (

    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    conteudo TEXT,
    criado_em TIMESTAMP DEFAULT NOW()

);

CREATE TABLE TB_CAPITULO (

    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    titulo VARCHAR(100),
    conteudo TEXT

);