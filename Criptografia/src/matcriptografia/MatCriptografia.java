 package matcriptografia;

public class MatCriptografia {

    static JFrameTela frame;
    static AlfabetoKey alfa;

    static String entrada;

    static String saida;

    public static void main(String[] args) {

        alfa = new AlfabetoKey();
        alfa.setarAlfabeto();

        frame = new JFrameTela();
        frame.setVisible(true);

    }

    public static void criptografar(JFrameTela frame) {
        entrada = frame.getjTFentrada().getText();
        entrada = entrada.toUpperCase();

        saida = "";
        for (int i = 0; i < entrada.length(); i++) {
            for (int j = 0; j < 27; j++) {
                if (entrada.charAt(i) == alfa.key[j].charAt(0)) {
                    if (j <= 22) {
                        saida += alfa.key[j + 3];
                    } else {
                        saida += alfa.key[j - 27 + 3];
                    }
                }
            }
        }

        frame.setjTFsaidaTXT(saida);

    }

    public static void descriptografar(JFrameTela frame) {
        entrada = frame.getjTFentrada().getText();
        entrada = entrada.toUpperCase();

        saida = "";
        for (int i = 0; i < entrada.length(); i++) {
            for (int j = 0; j < 27; j++) {
                if (entrada.charAt(i) == alfa.key[j].charAt(0)) {
                    if (j <= 2) {
                        saida += alfa.key[j + 27 - 3];
                    } else {
                        saida += alfa.key[j - 3];
                    }
                }
            }
        }

        frame.setjTFsaidaTXT(saida);
    }
}
