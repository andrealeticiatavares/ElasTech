package Assincrono.EstruturaDeControle;

import org.jetbrains.annotations.NotNull;

public class TesteVetoresArgs {
    public static void main(String @NotNull [] args) {
        System.out.println("Parametros passados pela linha de comando...");

        for (int pos = 0; pos< args.length; pos++){
            System.out.println("Parametro"+pos+"="+args[pos]);
        }
    }
}
