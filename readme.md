## Projeto Criado para centralizar as configurações básicas utilizadas para iniciar um projeto Spring+Banco de Dados Postgres + Imagem Docker

1. Antes de realizar o start da aplicação inicei a imagem do banco de dados através do comando.

> docker-compose up ou docker-compose up -d

> O Ideal seria após a subida do banco de dados checar se os dados informados no docker compose está correto, e uma simples tentativa de conexão utilizando o pgadmin ou dbeaver poe exemplo pode garantir que ao subir e persistir no banco não irá ocorrer nenhuma problema inespedo.

2. Estando tudo ok com a imagem do banco de dados e as credenciais de acesso é hora de confirmar os dados informados no properties.

3. Se os passos anteriores obteverem sucesso é só começar a implementar conforme demanda.
