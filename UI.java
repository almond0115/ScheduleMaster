import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class UI extends JFrame{
    private CardLayout card = new CardLayout(); // 카드 레이아웃을 위한 객체
    private JButton Login; // 로그인 버튼
    private JButton Backpack; // 책가방 버튼
    private JButton Course_registration; // 수강신청 버튼
    private JLabel ID; // 아이디 라벨
    private JTextField ID_field; // 아이디 입력칸
    private JLabel PW; // 비밀번호 라벨
    private JTextField PW_field; // 비밀번호 입력칸
    private JButton Back1; // 돌아가기 버튼1
    private JButton Back2;
    private JButton Back3;
    private JButton Check1; // 확인 버튼
    private JButton Check2;
    private JButton Add; // 강좌 추가 버튼
    private input_class Test;
    public UI() {
        Container contentPane = getContentPane(); // 콘텐트 페인의 페인 객체 생성

        // 프로그램의 기본 데이터 값들을 정함
        setTitle("ScheduleMaster");
        setSize(500, 300);
        setLocation(800, 400);

        // 프레임의 컨텐트 페인의 화면 구성 관리자 생성
        contentPane.setLayout(card);

        Login = new JButton("로그인"); // 로그인 버튼 객체 추가
        Backpack = new JButton("책가방"); // 책가방 버튼 객체 추가
        Course_registration = new JButton("수강신청"); // 수강신청 버튼 객체 추가
        ID = new JLabel("아이디"); // 아이디 라벨 객체 추가
        ID_field = new JTextField("학번",8); // 아이디 입력칸 객체 추가
        PW = new JLabel("비밀번호"); // 비밀번호 라벨 객체 추가
        PW_field = new JTextField(12); // 비밀번호 입력칸 객체 추가
        Back1 = new JButton("돌아가기"); // 돌아가기 버튼 객체 추가
        Back2 = new JButton("돌아가기");
        Back3 = new JButton("돌아가기");
        Check1 = new JButton("확인"); // 확인 버튼 객체 추가
        Check2 = new JButton("확인");
        Add = new JButton("강좌 추가"); // 강좌추가 버튼 객체 추가

        // 메인화면에 들어갈 컴포넌트들과 그것을 포함하는 main페인 생성
        JPanel Main = new JPanel();
        Main.setLayout(new GridLayout(1, 3));
        Main.add(Login);
        Main.add(Backpack);
        Main.add(Course_registration);
        add("main", Main); // main이란 이름의 카드 추가

        // 로그인 화면에 들어갈 컴포넌트들과 그것을 포함하는 login페인 생성
        JPanel login = new JPanel();
        login.setLayout(new BoxLayout(login, BoxLayout.Y_AXIS));

        Box IDBox = Box.createHorizontalBox(); // 수평으로 id관련 컴포넌트들을 묶어주는 box 생성
        Box PWBox = Box.createHorizontalBox(); // 수평으로 pw관련 컴포넌트들을 묶어주는 box 생성
        Box BUTBox = Box.createHorizontalBox(); // 수평으로 버튼 관련 컴포넌트들을 묶어주는 box 생성

        IDBox.add(ID); IDBox.add(Box.createHorizontalStrut(12)); IDBox.add(ID_field);
        PWBox.add(PW); PWBox.add(PW_field);
        BUTBox.add(Box.createHorizontalGlue()); BUTBox.add(Check1); BUTBox.add(Back1);

        login.add(IDBox); login.add(Box.createVerticalStrut(20));
        login.add(PWBox); login.add(BUTBox);
        add("login", login); // login 이란 이름의 카드 추가

        // 책가방 화면에 들어갈 컴포넌트들과 그것을 포함하는 backpack 페인 생성
        JPanel backpack = new JPanel();
        JPanel area = new JPanel();
        area.setLayout(new GridLayout(1,2));
        backpack.setLayout(new BorderLayout());
        area.add(Back2);
        area.add(Add);
        backpack.add(area, BorderLayout.SOUTH);
        add("backpack", backpack); // backpack 이란 이름의 카드 추가

        // 수강신청 화면에 들어갈 컴포넌트들과 그것을 포함하는 reg 페인 생성
        JPanel reg = new JPanel();
        reg.setLayout(new BorderLayout());
        reg.add(Back3, BorderLayout.SOUTH);
        add("reg", reg); // reg 라는 이름의 카드 추가

        // 사건 리스너 객체를 만들고 버튼 객체의 사건 리스너로 설정
        ButtonListener listener = new ButtonListener();
        Login.addActionListener(listener);
        Backpack.addActionListener(listener);
        Course_registration.addActionListener(listener);
        Back1.addActionListener(listener);
        Back2.addActionListener(listener);
        Back3.addActionListener(listener);
        Add.addActionListener(listener);
        Check2.addActionListener(listener);

        // 프로그램 종료
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent action) {
            if(action.getSource() == Login) { // 로그인 버튼이 눌렸을 경우
                card.show(getContentPane(), "login"); // 로그인 화면 전환
                setSize(300, 150);
            }
            else if(action.getSource() == Backpack) { // 책가방 버튼이 눌렸을 경우
                card.show(getContentPane(), "backpack"); // 책가방 화면 전환
            }
            else if(action.getSource() == Course_registration) { // 수강신청 버튼이 눌렸을 경우
                card.show(getContentPane(), "reg"); // 수강신청 화면 전환
            }
            else if(action.getSource() == Back1) { // 로그인 화면의 돌아가기 버튼을 눌렀을 경우
                card.show(getContentPane(), "main"); // 메인 화면 전환
                setSize(500, 300);
            }
            else if(action.getSource() == Back2) { // 책가방 화면의 돌아가기 버튼을 눌렸을 경우
                card.show(getContentPane(), "main");
                setSize(500, 300);
            }
            else if(action.getSource() == Back3) { // 수강신청 화면의 돌아가기 버튼을 눌렀을 경우
                card.show(getContentPane(), "main");
                setSize(500, 300);
            }
            else if(action.getSource() == Check2) { // 강좌 추가화면에서 확인 버튼을 눌렀을 경우
                Test.dispose();
            }
            else if(action.getSource() == Add) { // 책가방 화면의 강좌 추가 버튼을 눌렀을 경우
                Test = new input_class();
            }
        }
    }
    public class input_class extends JDialog { // 추가할 강좌 입력하는 창
        public input_class() {
            Container inputPane = getContentPane();

            setTitle("강좌 추가하기");
            setSize(200, 100);
            setLocation(700, 300);
            setVisible(true);
            setModal(true);

            inputPane.setLayout(new GridLayout(2, 1));
            inputPane.add(new JTextField());
            inputPane.add(Check2);
        }
    }
}
