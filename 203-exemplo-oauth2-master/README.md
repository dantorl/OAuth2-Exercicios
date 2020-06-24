# Demonstração OAuth2

Esses 2 projetos tem o objetivo de demonstrar o funcionamento do OAuth2 em uma estrutura de microsserviços, sendo eles:

## Authorization Server (authserver):
Servidor de autorização do OAuth2, ele é o responsável por gerenciar os acessos das aplicações (clients) aos recursos (Resource Server) e emitir os tokens de acesso.

Obs: Não vimos em aula a explicação detalhada desse projeto, estuda-lo é um bonus.

## Carro (carro):
Uma aplicação simples simulando um Resource Server, quando requisitada retorna um objeto carro contendo o nome do usuário logado como dono e o modelo do carro preenchido na URL.