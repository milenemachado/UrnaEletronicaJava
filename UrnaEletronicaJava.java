import java.util.ArrayList;
import java.util.Scanner;

public class UrnaEletronicaJava {

    private int votosNulos;
    private int votosValidos;
    private ArrayList<Candidatos> candidatos;

    public UrnaEletronicaJava() {
        this.candidatos = new ArrayList<>();
        this.votosNulos = 0;
        this.votosValidos = 0;
    }

    public void inicializarCandidatos() {
        this.candidatos.add(new Candidatos("01", "Ada Lovelace"));
        this.candidatos.add(new Candidatos("02", "Alan Turing"));
        this.candidatos.add(new Candidatos("03", "Marie Curie"));
        this.candidatos.add(new Candidatos("04", "Albert Einstein"));
        this.candidatos.add(new Candidatos("05", "Ludwig van Beethoven"));
    }

    public void exibirCandidatos() {
        System.out.println("\n\tLista de Candidatos:");
        for (Candidatos candidato : candidatos) {
            System.out.println("Número: " + candidato.getNumero() + " - Nome: " + candidato.getNome());
        }
        System.out.println("\nRegras de Votação:");
        System.out.println("1. Apenas números de dois dígitos (01 a 05) são aceitos como votos válidos.");
        System.out.println("2. Qualquer outro número será registrado como voto nulo.");
    }

    public void receberVoto(String numero) {
        boolean votoValido = false;
        for (Candidatos candidato : candidatos) {
            if (candidato.getNumero().equals(numero)) {
                candidato.incrementarVotos();
                votosValidos++;
                votoValido = true;
                break;
            }
        }

        if (!votoValido) {
            System.out.println("Número inválido. Voto nulo registrado.");
            votosNulos++;
        }
    }

    public void exibirResultados() {
        if (votosValidos == 0) {
            System.out.println("Nenhum voto válido foi registrado.");
            return;
        }

        System.out.println("\nResultados da Eleição:");
        ArrayList<Candidatos> vencedores = new ArrayList<>();
        int maiorVoto = -1;

        for (Candidatos candidato : candidatos) {
            int votos = candidato.getVotos();
            double percentual = ((double) votos / votosValidos) * 100;
            System.out.printf("Candidato: %s, Votos: %d, Percentual: %.2f%%\n",
                    candidato.getNome(), votos, percentual);

            if (votos > maiorVoto) {
                vencedores.clear();
                vencedores.add(candidato);
                maiorVoto = votos;
            } else if (votos == maiorVoto) {
                vencedores.add(candidato);
            }
        }

        System.out.println("\nVotos Nulos: " + votosNulos);

        if (vencedores.size() > 1) {
            System.out.println("Houve um empate entre os seguintes candidatos:");
            for (Candidatos vencedor : vencedores) {
                System.out.println("- " + vencedor.getNome() + " com " + maiorVoto + " votos.");
            }
        } else {
            System.out.println("Vencedor: " + vencedores.get(0).getNome() + " com " + maiorVoto + " votos.");
        }
    }

    public static void main(String[] args) {
        UrnaEletronicaJava urna = new UrnaEletronicaJava();
        urna.inicializarCandidatos();

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tBem-Vindo à Urna Eletrônica!\n");

        urna.exibirCandidatos();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("\nVoto %d/10: Informe o número do candidato (01 a 05): ", i);
            String voto = sc.nextLine();

            if (!voto.matches("\\d{2}")) {
                System.out.println("Entrada inválida. Deve ser um número de dois dígitos.");
                i--; // Repetir o voto
                continue;
            }

            urna.receberVoto(voto);
        }

        urna.exibirResultados();
        sc.close();
    }
}