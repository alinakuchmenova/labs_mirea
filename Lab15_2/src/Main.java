import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Country");
        jFrame.setSize(400,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel(new FlowLayout());
        String[] countries = {"Australia", "China", "England", "Russia"};
        JComboBox<String> jComboBox = new JComboBox<>(countries);
        JLabel jLabel = new JLabel("Information", SwingConstants.CENTER);
        jLabel.setPreferredSize(new Dimension(360, 540));
        jLabel.setFont(new Font("Times new roman", Font.ITALIC, 16));
        jPanel.add(jComboBox);
        jPanel.add(jLabel);
        String text1 = "Australia, officially the Commonwealth of Australia, is a sovereign country comprising the mainland of the Australian continent, the island of Tasmania, and numerous smaller islands. Australia is the largest country by area in Oceania and the world's sixth-largest country. Australia is the oldest, flattest, and driest inhabited continent, with the least fertile soils. It is a megadiverse country, and its size gives it a wide variety of landscapes and climates, with deserts in the centre, tropical rainforests in the north-east, tropical savannas in the north, and mountain ranges in the south-east";
        String text2 = "China (Chinese: 中国; pinyin: Zhōngguó), officially the People's Republic of China (PRC), is a country in East Asia. It is the world's second-most-populous country, with a population exceeding 1.4 billion. China spans the equivalent of five time zones and borders fourteen countries by land, tied with Russia as having the most of any country in the world. With an area of nearly 9.6 million square kilometers (3,700,000 sq mi), it is the world's third-largest country by total land area. The country is divided into 22 provinces, five autonomous regions, four municipalities, and two semi-autonomous special administrative regions. The national capital is Beijing, and the most populous city and largest financial center is Shanghai. ";
        String text3 = "England is a country that is part of the United Kingdom. It shares land borders with Wales to its west and Scotland to its north, while Ireland is located across the Irish Sea to its west and northwest, and the Celtic Sea lies to its southwest. It is separated from continental Europe by the North Sea to the east and the English Channel to the south. The country covers roughly 62% of the island of Great Britain, which is in the North Atlantic, and includes over 100 smaller islands such as the Isles of Scilly and the Isle of Wight.";
        String text4 = "Russia (Russian: Россия, romanized: Rossiya, [rɐˈsʲijə]), or the Russian Federation, is a country spanning Eastern Europe and Northern Asia. It is the largest country in the world by area, extends across eleven time zones, and shares land boundaries with fourteen countries. It is the world's ninth-most populous country and Europe's most populous country. The country's capital and largest city is Moscow. Saint Petersburg is Russia's second-largest city and \"cultural capital\". Other major urban areas in the country include Novosibirsk, Yekaterinburg, Nizhny Novgorod, Chelyabinsk, Krasnoyarsk, and Kazan. ";
        StringBuilder text1br = new StringBuilder();
        StringBuilder text2br = new StringBuilder();
        StringBuilder text3br = new StringBuilder();
        StringBuilder text4br = new StringBuilder();
        int x;
        for (x = 50; x < text1.length(); x+=50){
            text1br.append(text1, x - 50, x);
            text1br.append("<br>");
        }
        text1br.append(text1, x - 50, text1.length());
        text1 = "<html>" + text1br + "</html>";
        String finalText1 = text1;
        for (x = 50; x < text2.length(); x+=50){
            text2br.append(text2, x - 50, x);
            text2br.append("<br>");
        }
        text2br.append(text2, x - 50, text2.length());
        text2 = "<html>" + text2br + "</html>";
        String finalText2 = text2;
        for (x = 50; x < text3.length(); x+=50){
            text3br.append(text3, x - 50, x);
            text3br.append("<br>");
        }
        text3br.append(text3, x - 50, text3.length());
        text3 = "<html>" + text3br + "</html>";
        String finalText3 = text3;
        for (x = 50; x < text4.length(); x+=50){
            text4br.append(text4, x - 50, x);
            text4br.append("<br>");
        }
        text4br.append(text4, x - 50, text4.length());
        text4 = "<html>" + text4br + "</html>";
        String finalText4 = text4;
        jComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jComboBox.getSelectedItem()=="Australia") jLabel.setText(finalText1);
                if (jComboBox.getSelectedItem()=="China") jLabel.setText(finalText2);
                if (jComboBox.getSelectedItem()=="England") jLabel.setText(finalText3);
                if (jComboBox.getSelectedItem()=="Russia") jLabel.setText(finalText4);
            }
        });
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}