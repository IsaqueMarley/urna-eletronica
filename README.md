# urna-eletronica

Em resumo, o projeto consiste em um sistema de votação simples que usa autenticação de usuário e 
verificação de integridade de dados para garantir a segurança e a confiabilidade dos votos.


A classe Login é responsável por autenticar o usuário que acessa o sistema. Ela pede ao usuário que entre com 
um nome de usuário e uma senha. Em seguida, ela compara o nome de usuário e a senha com os valores armazenados em 
uma tabela de usuários, e se a combinação for encontrada, o usuário é autenticado e pode acessar o sistema.

A votação é aberta e qualquer pessoa que tenha um cadastro pode votar quantas vezes quiser. O sistema armazena os votos 
em um arquivo de texto chamado "votos.txt". Quando a votação é encerrada, é necessário  executar manualmente a classe "ContarVotos"
é para contar os votos de cada ator e determinar o vencedor. Além disso, é gerado um hash do arquivo "votos.txt" para fins de segurança, 
que é comparado com o hash gerado durante o login para garantir que os votos não foram adulterados. A classe também determina qual ator recebeu 
o maior número de votos. Se houver um empate entre dois ou mais atores, a classe imprime todos os atores que receberam o maior número de votos.

