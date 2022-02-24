## Projeto Criado para centralizar as configurações básicas utilizadas para iniciar um projeto Spring+Banco de Dados Postgres + Imagem Docker

1. Antes de realizar o start da aplicação inicei a imagem do banco de dados através do comando.

> docker-compose up ou docker-compose up -d

> O Ideal seria após a subida do banco de dados checar se os dados informados no docker compose está correto, e uma simples tentativa de conexão utilizando o pgadmin ou dbeaver poe exemplo pode garantir que ao subir e persistir no banco não irá ocorrer nenhuma problema inespedo.

2. Estando tudo ok com a imagem do banco de dados e as credenciais de acesso é hora de confirmar os dados informados no
   properties.

3. Se os passos anteriores obteverem sucesso é só começar a implementar conforme demanda.

4. Adicionado imagem do Mysql ao repositorio:

-  > docker-compose -f compose-mysql.yml up

## Documentação - links uteis.

- https://hub.docker.com/_/postgres
- https://docs.docker.com/engine/reference/commandline/image_ls/
- https://docs.docker.com/engine/reference/run/
- https://stack.desenvolvedor.expert/appendix/docker/basecode.html
- https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html#application-properties.data.spring.jpa.database-platform
  -https://mysqlconnector.net/connection-options/

> Referencia XSD pom.xml -https://maven.apache.org/ref/2.2.1/maven-model/maven.html#class_build

## Leitura

- https://medium.com/equals-lab/15-boas-pr%C3%A1ticas-para-desenvolvimento-de-aplica%C3%A7%C3%B5es-com-spring-boot-953e0ff2e24f

## Música para descontrair :D

- https://www.youtube.com/watch?v=zpzoG5KGaHg

## Extensão VSCode

- Extension Pack for Java v0.21.0

> Api de Teste
>

```
POST:
/api/cadastro/usuario
 {
"nome": "JOAO GOMES",
"apelido": "JOAO"
}

```

```
POST:  PUBLICAR
/api/publicacoes

{
    "id": "1b657106-07d7-4871-9b99-addc1780674b",
    "detalhes": "informar detalhes da publicacao",
    "usuario": {
        "uuid": "ee18bd11-fd81-4f67-8395-7d17ff92971b"
    }
}

```

```
GET:  OBTER PUBLICACÕES
/api/publicacoes
```

Pendencias:

- [x] Criar DTO para as Request e Response [USUARIO]
- [x] Adicionar o MAPSTRUCT no projeto.
- [ ] Criar paginação das publicações;
- [ ] Configurar o Cross para permitir comunicação com o NEXT


>Exemplo de post de publicações

POST: PUBLICACAO

[
    {
    "id": "c7678848-bb2c-45e6-888b-5314c459733c",
    "detalhes": "Publicacao Teste para obter o json",
    "categoria": "TI",
    "data": "2022-02-24T21:57:36.351+00:00",
        "usuario": {
        "id": "06e2cc06-2ec2-4a7f-a98c-1621f62b4acc",
        "nome": "TESTE",
        "apelido": "development"
        }
    }
]
