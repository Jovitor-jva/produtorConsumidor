## Código simples que envolve o problema de consumidor produtor.

Problema proposto:

Um problema bem conhecido da computação é o chamado produtor versus consumidor. O problema é simples e retrata condições como sincronização, concorrência, deadlock etc. A descrição do problema é o seguinte: existem as figuras do produtor (alguém que produz algo e guarda em um armazém) e a do consumidor (que vai ao armazém e utiliza o que foi produzido). Agora, vamos conhecer algumas situações:

SITUAÇÃO 1 - O produtor e o consumidor terão acesso ao armazém, ou seja, eles precisam compartilhar a chave e nunca poderão brigar. Por exemplo, o produtor está tentando colocar alguma coisa e o consumidor já tentando usar. Eles são educados e o consumidor só pega alguma se o produtor já colocou lá em definitivo.

SITUAÇÃO 2 - O produtor não deve desperdiçar seu produto, então se o armazém estiver cheio ele deve parar de produzir. Da mesma maneira, o consumidor não deve perder a viagem e tentar consumir alguma coisa se o armazém estiver vazio.

SITUAÇÃO 3 - Sempre que o produtor encher o armazém ele deve ir dormir. De forma semelhante, sempre que o consumidor consumir tudo ele deve ir dormir. Podemos colocar uma comunicação entre eles de maneira que, sempre que um for dormir, acorda o outro para trabalhar.

SITUAÇÃO 4 - Sempre que houver a possibilidade de ambos trabalharem, devemos aproveitar, ou seja, se o armazém estiver no meio, (nem cheio nem vazio), tanto o produtor pode colocar coisas como o consumidor pode pegar coisas.