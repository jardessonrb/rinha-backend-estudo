# Rinha Backend Estudo -  2023
 
É um repositório onde fiz o desafio/competição chamada rinha de backend que pode ser vista por esse [repositorio](https://github.com/zanfranceschi/rinha-de-backend-2023-q3)
. As instruções podem ser acessadas por [aqui](https://github.com/zanfranceschi/rinha-de-backend-2023-q3/blob/main/INSTRUCOES.md)
. Basicamente, o desafio consiste em criar uma API com 4 endpoints:
- GET localhost:8080/pessoas?t=termodabusca
- GET localhost:8080/pessoas/uuid-da-pessoa-cadastrada
- GET localhost:8080/contagem-pessoas
- POST localhost:8080/pessoas

O diferencial é forma de rodar e testar, por que no desafio você só tem 3GB de memoria para distribuir entre duas APIS. Além disso, ambas devem ser coordenadas por um NGINX, e tudo deve ser criada através de um docker-compose para apenas rodar, com as imagens no dockerhub, claro.
