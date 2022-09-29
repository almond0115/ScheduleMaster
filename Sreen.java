import javax.swing.JFrame;

public class Sreen extends JFrame {
    Sreen() {
        setVisible(true);	//창을 눈에 보이도록 함
        setSize(640, 480);	//사이즈는 640*480
        setResizable(false);	//사이즈 재조정 불가능
        setLocationRelativeTo(null);	//창이 가운데에 뜨도록 함
        setDefaultCloseOperation(EXIT_ON_CLOSE);	//창을 끄면 프로그램을 종료
    }
}
