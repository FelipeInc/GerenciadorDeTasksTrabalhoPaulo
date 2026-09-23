import controller.UserControler;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean isOn = true;

        UserControler userControler = new UserControler();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Bem-Vindo ao gerenciador de task");
        do {
            System.out.println("Digite um numero para acessar um servico:");
            System.out.println("1-Criar usuario");
            System.out.println("2-Buscar usuario pelo id");
            System.out.println("3-Atualizar cadastro");
            System.out.println("4-Deletar usuario");
            System.out.println("5-Sair");

            int number = scanner.nextInt();
            switch (number) {
                case 1 -> userControler.register();
                case 2 -> userControler.findUser();
                case 5 -> isOn = false;
                default -> System.out.println("Opcao invalida");
            }
        } while (isOn);
    }

}
