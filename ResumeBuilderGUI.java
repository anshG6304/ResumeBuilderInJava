import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ResumeBuilderGUI {
    private JFrame frame;
    private JLabel nameLabel, emailLabel, phoneLabel, experienceLabel, educationLabel, AddressLabel, SkillLabel,HobbyLabel;
    private JTextField nameField, emailField, phoneField, experienceField, educationField, AddressField, SkillField, HobbyField;
    private JButton createResumeButton;

    public ResumeBuilderGUI() {
        createGUI();
        addComponents();
        addActionListeners();
    }

    private void createGUI() {
        frame = new JFrame("Resume Builder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setLayout(new GridLayout(9, 2));
    }

    private void addComponents() {
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        phoneLabel = new JLabel("Phone:");
        phoneField = new JTextField();

        experienceLabel = new JLabel("Work Experience:");
        experienceField = new JTextField();

        educationLabel = new JLabel("Education:");
        educationField = new JTextField();

        AddressLabel = new JLabel("Address:");
        AddressField = new JTextField();

        SkillLabel = new JLabel("Skills:");
        SkillField = new JTextField();
        
        HobbyLabel = new JLabel("Hobbies and Interests:");
        HobbyField = new JTextField();

        createResumeButton = new JButton("Create Resume");

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(phoneLabel);
        frame.add(phoneField);
        frame.add(experienceLabel);
        frame.add(experienceField);
        frame.add(educationLabel);
        frame.add(educationField);
        frame.add(AddressLabel);
        frame.add(AddressField);
        frame.add(SkillLabel);
        frame.add(SkillField);
        frame.add(HobbyLabel);
        frame.add(HobbyField);

        frame.add(createResumeButton);
    }

    private void addActionListeners() {
        createResumeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                String experience = experienceField.getText();
                String education = educationField.getText();
                String address = AddressField.getText();
                String skills = SkillField.getText();
                String hobby = HobbyField.getText();


                String resume = "Name: " + name + "\n" +
                                "Email: " + email + "\n" +
                                "Phone: " + phone + "\n" +
                                "Work Experience: " + experience + "\n" +
                                "Education: " + education + "\n" +
                                "Address: " + address + "\n" +
                                "Skills: " + skills + "\n" +
                                "Hobbies: " + hobby + "\n" ;

                JOptionPane.showMessageDialog(null, resume, "Resume", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public void display() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ResumeBuilderGUI resumeBuilder = new ResumeBuilderGUI();
        resumeBuilder.display();
    }
}
