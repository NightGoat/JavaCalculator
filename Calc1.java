import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc1 extends JFrame {
    private JButton Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Plus, Minus, Divide, Multiply, Erase, Equals, Info, Exp, AddMinus, AddDot;// Кнопки
    private JTextField field; // Текстовое поле
    private boolean SUM = false, DIF = false, MUT = false, DIV = false, EXP = false;// Определители действия сложения, вычитания, умножения и деления
    private String FirstNumber = "0"; // Обозначим первое число в действии
    private String SecondNumber = "0"; // Обозначим второе число в действии, чтобы если человек не ввел что-либо, чтобы можно было что-либо подставить
    private double DoubleFirstNumber, DoubleSecondNumber; // Числа принимаемые с текстового поля - текст,
    // их нужно будет переводить  в double

    boolean k, l = false;

    private Calc1() {
        super("Калькулятор v.0.01");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Кнопка информации внизу
        Info = new JButton("Read me!");
        Container container = getContentPane();
        // Текстовое поле вверху
        field = new JTextField(20);
        field.setEditable(false);
        field.setHorizontalAlignment(JTextField.RIGHT);
        container.add(field, "North");
        //Кнопка информации внизу
        container.add(Info, "South");

        //Клавиатура по центру
        JPanel grid = new JPanel();
        container.add(grid, "Center");
        GridLayout layout = new GridLayout(5, 4, 1, 1); // Обозначим сетку
        grid.setLayout(layout); // и присвоим панели стиль сетки

        //Добавим цифры
        Zero = new JButton("0");
        One = new JButton("1");
        Two = new JButton("2");
        Three = new JButton("3");
        Four = new JButton("4");
        Five = new JButton("5");
        Six = new JButton("6");
        Seven = new JButton("7");
        Eight = new JButton("8");
        Nine = new JButton("9");
        // Функции:
        // Плюс
        Plus = new JButton("+");
        // Минус
        Minus = new JButton("-");
        // Делить
        Divide = new JButton("/");
        // Умножить
        Multiply = new JButton("*");
        // Стереть
        Erase = new JButton("C");
        // Равно
        Equals = new JButton("=");
        // Возведение в степень
        Exp = new JButton("exp");
        // Добавить минус
        AddMinus = new JButton("-/+");
        // Добавить точку
        AddDot = new JButton(".");

        // Добавим их в сетку
        grid.add(Seven);
        grid.add(Eight);
        grid.add(Nine);
        grid.add(Plus);
        grid.add(Four);
        grid.add(Five);
        grid.add(Six);
        grid.add(Minus);
        grid.add(One);
        grid.add(Two);
        grid.add(Three);
        grid.add(Divide);
        grid.add(Erase);
        grid.add(Zero);
        grid.add(Equals);
        grid.add(Multiply);
        grid.add(Exp);
        grid.add(AddMinus);
        grid.add(AddDot);

        // Обьявим нажатия
        Calculate Calc2 = new Calculate();
        Zero.addActionListener(Calc2);
        One.addActionListener(Calc2);
        Two.addActionListener(Calc2);
        Three.addActionListener(Calc2);
        Four.addActionListener(Calc2);
        Five.addActionListener(Calc2);
        Six.addActionListener(Calc2);
        Seven.addActionListener(Calc2);
        Eight.addActionListener(Calc2);
        Nine.addActionListener(Calc2);
        Erase.addActionListener(Calc2);
        Equals.addActionListener(Calc2);
        Plus.addActionListener(Calc2);
        Minus.addActionListener(Calc2);
        Multiply.addActionListener(Calc2);
        Divide.addActionListener(Calc2);
        Info.addActionListener(Calc2);
        Exp.addActionListener(Calc2);
        AddMinus.addActionListener(Calc2);
        AddDot.addActionListener(Calc2);

        //Добавим сетку
        getContentPane().add(grid);
        pack();
        setSize(400, 300); // Установим стандартный размер
        setLocationRelativeTo(null); // Программа будет появлятся по центру экрана
        Font font1 = new Font("Courier", Font.BOLD, 30);
        field.setFont(font1);
        setResizable(false); //запретим изменять размер экрана
        setVisible(true);

    }

    public class Calculate implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Zero) { // Если нажали на кнопку Ноль
                field.setText(field.getText() + "0");  // Берем число в текстовом поле и прибавляем ему ноль
            }

            if (e.getSource() == One) {
                field.setText(field.getText() + "1"); // ... прибавляем единицу
            }

            if (e.getSource() == Two) {
                field.setText(field.getText() + "2"); // и тд
            }

            if (e.getSource() == Three) {
                field.setText(field.getText() + "3");
            }

            if (e.getSource() == Four) {
                field.setText(field.getText() + "4");
            }

            if (e.getSource() == Five) {
                field.setText(field.getText() + "5");
            }

            if (e.getSource() == Six) {
                field.setText(field.getText() + "6");
            }

            if (e.getSource() == Seven) {
                field.setText(field.getText() + "7");
            }

            if (e.getSource() == Eight) {
                field.setText(field.getText() + "8");
            }
            if (e.getSource() == Nine) {
                field.setText(field.getText() + "9");
            }

            if (e.getSource() == Erase) {
                field.setText(null); // Очищает текстовое поле
                k = false;
                l = false;

            }

            if (e.getSource() == Plus) {
                FirstNumber = field.getText(); // Получим число в текстового поля
                field.setText(null); // Очистим текстовое поле
                SUM = true; // Обозначим нужную переменную
                DIF = false; // А другие отключим чтобы не путать кнопку Equals (равно)
                MUT = false;
                DIV = false;
                EXP = false;
                k = false;
                l = false;

            }

            if (e.getSource() == Minus) {
                FirstNumber = field.getText();
                field.setText(null);
                DIF = true;
                SUM = false;
                MUT = false;
                DIV = false;
                EXP = false;
                k = false;
                l = false;

            }

            if (e.getSource() == Multiply) {
                FirstNumber = field.getText();
                field.setText(null);
                MUT = true;
                SUM = false;
                DIF = false;
                DIV = false;
                EXP = false;
                k = false;
                l = false;

            }

            if (e.getSource() == Divide) {
                FirstNumber = field.getText();
                field.setText(null);
                DIV = true;
                SUM = false;
                DIF = false;
                MUT = false;
                EXP = false;
                k = false;
                l = false;
            }

            if (e.getSource() == Equals) {
                l = true;
                if (SUM) { // Если пришла сумма...
                    if (!k) {
                        // (k - проверяет какой раз мы совершаем действия, если первый то с экрана берется Второе число в действии
                        // если второй, то с экрана берется первое число. Это нужно чтобы нажимая ровно он повторял дествие заного)
                        SecondNumber = field.getText();

                        DoubleFirstNumber = Double.parseDouble(FirstNumber); // ...то первое полученное число обернем в double
                        DoubleSecondNumber = Double.parseDouble(SecondNumber); // Затем и второе
                        double result2 = DoubleFirstNumber + DoubleSecondNumber; // Проссумируем

                        String StringResult = String.valueOf(result2); // обернем сумму в String
                        field.setText(StringResult); // И выведем результат в текстовое поле
                        k = true; // Изменим k на будущее
                    } else {
                        FirstNumber = field.getText();

                        DoubleFirstNumber = Double.parseDouble(FirstNumber);
                        DoubleSecondNumber = Double.parseDouble(SecondNumber);
                        double result2 = DoubleFirstNumber + DoubleSecondNumber;

                        String StringResult = String.valueOf(result2);
                        field.setText(StringResult);
                    }
                }

                if (DIF) {
                    if (!k) {
                        SecondNumber = field.getText();
                        DoubleFirstNumber = Double.parseDouble(FirstNumber);
                        DoubleSecondNumber = Double.parseDouble(SecondNumber);
                        double result2 = DoubleFirstNumber - DoubleSecondNumber;
                        String StringResult = String.valueOf(result2);
                        field.setText(StringResult);
                        k = true;
                    } else {
                        FirstNumber = field.getText();
                        DoubleFirstNumber = Double.parseDouble(FirstNumber);
                        DoubleSecondNumber = Double.parseDouble(SecondNumber);
                        double result2 = DoubleFirstNumber - DoubleSecondNumber;
                        String StringResult = String.valueOf(result2);
                        field.setText(StringResult); }
                }

                if (MUT) {
                    if (!k) {
                        SecondNumber = field.getText();
                        DoubleFirstNumber = Double.parseDouble(FirstNumber);
                        DoubleSecondNumber = Double.parseDouble(SecondNumber);
                        double result2 = DoubleFirstNumber * DoubleSecondNumber;
                        String StringResult = String.valueOf(result2);
                        field.setText(StringResult);
                        k = true;
                    } else {
                        FirstNumber = field.getText();
                        DoubleFirstNumber = Double.parseDouble(FirstNumber);
                        DoubleSecondNumber = Double.parseDouble(SecondNumber);
                        double result2 = DoubleFirstNumber * DoubleSecondNumber;
                        String StringResult = String.valueOf(result2);
                        field.setText(StringResult);
                    }
                }
                if (DIV) {
                    if (!k) {
                        SecondNumber = field.getText();
                        DoubleFirstNumber = Double.parseDouble(FirstNumber);
                        DoubleSecondNumber = Double.parseDouble(SecondNumber);

                        if (DoubleSecondNumber != 0) { // Проверим не делит ли кто-нибудь на ноль
                            double result2 = DoubleFirstNumber / DoubleSecondNumber;
                            String StringResult = String.valueOf(result2);
                            field.setText(StringResult);
                            k = true;
                        } else {
                            field.setText("∞"); // Выставим в поле знак бесконечности, вызовем окно ошибки и очистим текстовое поле
                            JOptionPane.showMessageDialog(Calc1.this, "На ноль делить нельзя!", "НЕЕЕЕЕТ", JOptionPane.ERROR_MESSAGE);
                            field.setText(null);
                        }
                    } else {
                        FirstNumber = field.getText();
                        DoubleFirstNumber = Double.parseDouble(FirstNumber);
                        DoubleSecondNumber = Double.parseDouble(SecondNumber);

                        if (DoubleSecondNumber != 0) {
                            double result2 = DoubleFirstNumber / DoubleSecondNumber;
                            String StringResult = String.valueOf(result2);
                            field.setText(StringResult);
                        } else {
                            field.setText("∞");
                            JOptionPane.showMessageDialog(Calc1.this, "На ноль делить нельзя!", "НЕЕЕЕЕТ", JOptionPane.ERROR_MESSAGE);
                            field.setText(null);
                        }
                    }
                }
                if (EXP) { // Возведение в степень
                    if (!k) {
                        SecondNumber = field.getText();
                        DoubleFirstNumber = Double.parseDouble(FirstNumber);
                        DoubleSecondNumber = Double.parseDouble(SecondNumber);
                        int RoundSecondNumber = (int) DoubleSecondNumber; // Округлим число, чтобы не возводить в дробь переведя в int
                        double[] nums2 = new double[RoundSecondNumber]; // Создадим массив длина которого равна второму числу
                        double result2 = 1.0;
                        for (int i = 0; i < RoundSecondNumber; i++) {
                            nums2[i] = DoubleFirstNumber; // присвоим каждому элементу массива значение первого числа
                            result2 *= nums2[i]; // и перемножим их
                        }
                        String StringResult = String.valueOf(result2);
                        field.setText(StringResult);
                        k = true;
                    } else {
                        FirstNumber = field.getText();
                        DoubleFirstNumber = Double.parseDouble(FirstNumber);
                        DoubleSecondNumber = Double.parseDouble(SecondNumber);
                        int RoundSecondNumber = (int) DoubleSecondNumber;
                        double[] nums2 = new double[RoundSecondNumber];
                        double result2 = 1.0;
                        for (int i = 0; i < RoundSecondNumber; i++) {
                            nums2[i] = DoubleFirstNumber;
                            result2 *= nums2[i];
                        }
                        String StringResult = String.valueOf(result2);
                        field.setText(StringResult);
                    }
                }
            }
            if (e.getSource() == Info) { // эта кнопка вызывает экран сообщения
                JOptionPane.showMessageDialog(Calc1.this, "Привет! Спасибо что проверил мой код!");
            }
            if (e.getSource() == Exp) { // это кнопка возведения в степень, она тут потому что я добавлял ее позже остальных
                FirstNumber = field.getText();
                field.setText(null);
                EXP = true;
                MUT = false;
                SUM = false;
                DIF = false;
                DIV = false;
                k = false;
                l = false;
            }
            if (e.getSource() == AddDot) { // Кнопка добавления точки, добавляет точку только 1 раз чтобы не пугать компилятор 2мя точками
                if (!l) {
                    field.setText(field.getText() + ".");
                    l = true;
                }

            }
            if (e.getSource() == AddMinus) { // Кнопка которая добавляет или убирает минус перед числом, банально умножает на -1.
                String Number = field.getText();
                double Number2 = Double.parseDouble(Number);
                Number2 *= -1;
                String Number3 = String.valueOf(Number2);
                field.setText(Number3);
            }
        }
    }

    public static void main(String[] args) {
        new Calc1();
    }
}