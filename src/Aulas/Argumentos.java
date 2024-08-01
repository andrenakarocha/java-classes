package Aulas;

public class Argumentos {
    public static void main(String[] args){
        // Nessa situação, devemos passar o argumento ao executar o programa usando um terminal
        // Ao passar o argumento, podemos manipulá-lo da forma que desejarmos
        // Usando esse formato, só podemos passar os argumentos pelo TERMINAL ao executar o código:
        // $ java Argumentos.java André
        // java -> Usado para rodar o arquivo | Argumentos.java -> Nome do arquivo | André -> O argumento passado
        System.out.println("Olá " + args[0]);
    }
}
