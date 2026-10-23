import java.time.Year;
import java.util.Scanner;

void main() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite o ano em que você nasceu: ");

    if (!teclado.hasNextInt()) {
        System.out.println("Ano inválido: digite apenas números.");
        return;
    }

    int anoNascimento = teclado.nextInt();
    int anoAtual = Year.now().getValue();
    int idade = anoAtual - anoNascimento;

    if (idade < 0 || idade > 130) {
        System.out.println("Ano inválido.");
        return;
    }

    System.out.println("Você tem ou vai fazer " + idade + " anos em " + anoAtual + ".");

    if (idade <= 11)
        System.out.println("Criança");
    else if (idade <= 17)
        System.out.println("Adolescente");
    else
        System.out.println("Adulto");
}
