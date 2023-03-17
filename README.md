# desafio_residenciaFAP

No arquivo log, foi possivel observar os padroes de gatilho para cada evento. 
 * Uma nova partida inicia com InitGame
 * Um novo jogador conecta-se ao jogo quando aparece a informação ClientUserinfoChanged, 
 * Uma nova morte é detectada sempre que aparece a palavra 'Kill', seguido pela informação: 'Jogador1 killed Jogador2 by Forma_morte', e depois a forma que ele morreu, descrevendo se foi caindo ou qual arma foi utilizada
 Podendo ser: MOD_TRIGGER_HURT
 * MOD_FALLING
 * MOD_RAILGUN
 * MOD_ROCKET
 * MOD_ROCKET_SPLASH
 * MOD_MACHINEGUN
 * Quando o jogo é finalizado, nota-se o padrão: 'Exit: Timelimit hit' , seguido de 'ShutdownGame'.
 
 Compreendi a proposta que foi passada de construir um parser, ou seja, um programa que fizesse a busca e encontrasse as palavras chave/padrões para fazer a contagem. Entendi que, uma das hipoteses seria transformar o arquivo log em txt e coloca-lo num array, mas não obtive sucesso em tentar montar o código. Pesquisei bastante na internet e encontrei material até em Ruby, passei esses dias tentando aprender um pouco da linguagem para que pudesse entender o código, mas não foi o suficiente pra compreender tudo. Tenho algum conhecimento em Java e apesar de pouco, consegui montar as classes usando POO, pois sei que dessa forma, as informações poderiam ser coletadas. Mas infelizmente, não consegui realizar o restante da atividade.
