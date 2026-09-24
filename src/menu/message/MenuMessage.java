package menu.message;

public class MenuMessage {
    public static void displayMainMenuMessage() {
        System.out.println("""
                
                ==============================
                Bem-vindo ao gerenciador de tarefas
                ==============================
                
                1 - Menu de usuário
                2 - Menu de tasks
                3 - Sair
                ==============================
                Digite uma opção:
                """);
    }

    public static void displayMenuUserMessage() {
        System.out.println("""
                
                ==============================
                      SISTEMA DE USUÁRIOS
                ==============================
                
                1 - Criar usuário
                2 - Buscar usuário por ID
                3 - Atualizar cadastro
                4 - Deletar usuário
                5 - Voltar ao menu principal
                
                ==============================
                Digite uma opção:
                """);
    }

    public static void displayMenuTaskMessage() {
        System.out.println("""
                
                ==============================
                      SISTEMA DE TASKS
                ==============================
                
                1 - Adicionar task
                2 - Buscar usuário por ID
                3 - Atualizar cadastro
                4 - Deletar usuário
                5 - Voltar ao menu principal
                
                ==============================
                Digite uma opção:
                """);
    }
}
