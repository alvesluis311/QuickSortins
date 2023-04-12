# QuickSortins

/*
Este código implementa uma versão do algoritmo de ordenação QuickSort em Java para uma lista de objetos Pessoa. O objetivo é ordenar essa lista de pessoas com base em seu atributo idade.

A classe QuickSortins contém três métodos principais: "quickSortinsIdade" e "particaoIdade". O método "quickSortinsIdade" é o método principal que implementa o algoritmo QuickSort. Ele recebe uma lista de pessoas, bem como dois índices que indicam o início e o fim da parte da lista a ser ordenada. Esses índices permitem que o algoritmo funcione de maneira recursiva.

O método "particaoIdade" é um método auxiliar que é usado para dividir a lista em duas partes. Ele recebe uma lista de pessoas e dois índices que indicam o início e o fim da parte da lista a ser dividida. O pivô é escolhido como o primeiro elemento da lista, e o método percorre a lista a partir do início e do final ao mesmo tempo, comparando os elementos com o pivô e movendo-os para a esquerda ou direita conforme necessário. Quando a posição dos elementos cruzam, o pivô é movido para o final da primeira lista.
urante a execução do algoritmo, o pivô é escolhido como o primeiro elemento da lista. Em seguida, o método "particaoIdade" percorre a lista da esquerda para a direita e da direita para a esquerda simultaneamente. Os elementos que são menores ou iguais ao pivô são deixados na parte esquerda da lista, enquanto os elementos maiores que o pivô são deixados na parte direita da lista. Quando os índices i e j se cruzam, o pivô é trocado de posição com o último elemento do subconjunto esquerdo. depois troca-se a posição do início que antes tinha o valor do pivô por j que agora se torna o valor do pivô

O algoritmo QuickSort funciona dividindo a lista em duas partes com base em um pivô. Em seguida, essas duas partes são ordenadas recursivamente usando o QuickSort. O pivô é escolhido como o primeiro elemento da lista e é usado para dividir a lista em duas partes. A primeira parte contém todos os elementos menores ou iguais ao pivô, e a segunda parte contém todos os elementos maiores que o pivô. Esse processo de divisão é realizado pelo método "particaoIdade".

Depois de dividir a lista em duas partes, o QuickSort é chamado recursivamente para cada uma dessas partes. Isso é feito pelo método "quickSortinsIdade", que chama o método "particaoIdade" e, em seguida, chama a si mesmo recursivamente para cada sublista. Esse processo é repetido até que a lista esteja completamente ordenada.

O critério de ordenação utilizado é a idade das pessoas, com os mais jovens primeiro e os mais velhos por último. A ordenação é realizada de forma crescente, ou seja, da idade mais baixa para a mais alta.

Em resumo, o algoritmo QuickSort é um algoritmo de ordenação muito eficiente, e esta implementação é feita em Java para uma lista de objetos Pessoa. O algoritmo funciona dividindo a lista em duas partes com base em um pivô e ordenando recursivamente essas partes. O pivô é escolhido como o primeiro elemento da lista, e o critério de ordenação é a idade das pessoas.


*/
