package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdmissionForm {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Student Admission Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 800); 
        frame.setLayout(new GridBagLayout());  

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);  

        JLabel titleLabel = new JLabel("METROPOLITAN UNIVERSITY");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20)); 
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER); 
        titleLabel.setForeground(Color.black);

        gbc.gridwidth = 2; 
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(titleLabel, gbc);

        gbc.gridwidth = 1; 
        gbc.gridy++; 

        JLabel nameLabel = new JLabel("Student Name:");
        JTextField nameField = new JTextField(20);

        JLabel fatherNameLabel = new JLabel("Father's Name:");
        JTextField fatherNameField = new JTextField(20);

        JLabel motherNameLabel = new JLabel("Mother's Name:");
        JTextField motherNameField = new JTextField(20);
        
        JLabel dobLabel = new JLabel("Date of Birth:");

        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.format("%02d", i + 1);
        }
        JComboBox<String> dayComboBox = new JComboBox<>(days);

        String[] months = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        JComboBox<String> monthComboBox = new JComboBox<>(months);
        
        String[] years = new String[35];
        for (int i = 0; i < years.length; i++) {
            years[i] = String.valueOf(2024 - i); 
        }
        JComboBox<String> yearComboBox = new JComboBox<>(years);

        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        JRadioButton otherRadio = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderGroup.add(otherRadio);

        JLabel religionLabel = new JLabel("Religion:");
        JRadioButton hinduRadio = new JRadioButton("Hindu");
        JRadioButton muslimRadio = new JRadioButton("Muslim");
        JRadioButton christianRadio = new JRadioButton("Christian");
        JRadioButton otherReligionRadio = new JRadioButton("Other");
        ButtonGroup religionGroup = new ButtonGroup();
        religionGroup.add(hinduRadio);
        religionGroup.add(muslimRadio);
        religionGroup.add(christianRadio);
        religionGroup.add(otherReligionRadio);

        JLabel bloodGroupLabel = new JLabel("Blood Group:");
        JRadioButton aPlus = new JRadioButton("A+");
        JRadioButton aMinus = new JRadioButton("A-");
        JRadioButton bPlus = new JRadioButton("B+");
        JRadioButton bMinus = new JRadioButton("B-");
        JRadioButton oPlus = new JRadioButton("O+");
        JRadioButton oMinus = new JRadioButton("O-");
        JRadioButton abPlus = new JRadioButton("AB+");
        JRadioButton abMinus = new JRadioButton("AB-");

        ButtonGroup bloodGroupGroup = new ButtonGroup();
        bloodGroupGroup.add(aPlus);
        bloodGroupGroup.add(aMinus);
        bloodGroupGroup.add(bPlus);
        bloodGroupGroup.add(bMinus);
        bloodGroupGroup.add(oPlus);
        bloodGroupGroup.add(oMinus);
        bloodGroupGroup.add(abPlus);
        bloodGroupGroup.add(abMinus);

        JPanel bloodGroupPanel = new JPanel();
        bloodGroupPanel.setLayout(new GridLayout(2, 4));  
        bloodGroupPanel.add(aPlus);
        bloodGroupPanel.add(aMinus);
        bloodGroupPanel.add(bPlus);
        bloodGroupPanel.add(bMinus);
        bloodGroupPanel.add(oPlus);
        bloodGroupPanel.add(oMinus);
        bloodGroupPanel.add(abPlus);
        bloodGroupPanel.add(abMinus);

        JLabel sscCgpaLabel = new JLabel("SSC GPA:");
        JTextField sscCgpaField = new JTextField(10);

        JLabel hscCgpaLabel = new JLabel("HSC GPA:");
        JTextField hscCgpaField = new JTextField(10);

        JLabel presentAddressLabel = new JLabel("Present Address:");
        JTextArea presentAddressField = new JTextArea(3, 20);
        JScrollPane presentAddressScroll = new JScrollPane(presentAddressField);

        JLabel permanentAddressLabel = new JLabel("Permanent Address:");
        JTextArea permanentAddressField = new JTextArea(3, 20);
        JScrollPane permanentAddressScroll = new JScrollPane(permanentAddressField);
        
        JCheckBox sameAsPresentAddress = new JCheckBox("Same as Present Address");

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JLabel phoneLabel = new JLabel("Phone:");
        JTextField phoneField = new JTextField(20);

        JLabel guardianLabel = new JLabel("Guardian Name:");
        JTextField guardianField = new JTextField(20);

        JLabel emergencyContactLabel = new JLabel("Emergency Contact:");
        JTextField emergencyContactField = new JTextField(20);

        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");

        JLabel departmentLabel = new JLabel("Department:");
        String[] departments = {"Computer Science", "Electrical Engineering", "Software Engineering", 
                                 "Economics", "English","Law And Justice","BBA"};
        JComboBox<String> departmentComboBox = new JComboBox<>(departments);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(nameLabel, gbc);

        gbc.gridx = 1;
        frame.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(fatherNameLabel, gbc);

        gbc.gridx = 1;
        frame.add(fatherNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(motherNameLabel, gbc);

        gbc.gridx = 1;
        frame.add(motherNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(dobLabel, gbc);

        JPanel datePanel = new JPanel();
        datePanel.add(dayComboBox);
        datePanel.add(new JLabel("/"));
        datePanel.add(monthComboBox);
        datePanel.add(new JLabel("/"));
        datePanel.add(yearComboBox);

        gbc.gridx = 1;
        frame.add(datePanel, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(genderLabel, gbc);

        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        genderPanel.add(otherRadio);
        gbc.gridx = 1;
        frame.add(genderPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(religionLabel, gbc);

        JPanel religionPanel = new JPanel();
        religionPanel.add(hinduRadio);
        religionPanel.add(muslimRadio);
        religionPanel.add(christianRadio);
        religionPanel.add(otherReligionRadio);
        gbc.gridx = 1;
        frame.add(religionPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(bloodGroupLabel, gbc);

        gbc.gridx = 1;
        frame.add(bloodGroupPanel, gbc);
    
        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(sscCgpaLabel, gbc);

        gbc.gridx = 1;
        frame.add(sscCgpaField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(hscCgpaLabel, gbc);

        gbc.gridx = 1;
        frame.add(hscCgpaField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(departmentLabel, gbc);

        gbc.gridx = 1;
        frame.add(departmentComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(presentAddressLabel, gbc);

        gbc.gridx = 1;
        frame.add(presentAddressScroll, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(permanentAddressLabel, gbc);

        gbc.gridx = 1;
        frame.add(permanentAddressScroll, gbc);

        gbc.gridx = 1;
        gbc.gridy++;
        frame.add(sameAsPresentAddress, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(emailLabel, gbc);

        gbc.gridx = 1;
        frame.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(phoneLabel, gbc);

        gbc.gridx = 1;
        frame.add(phoneField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(guardianLabel, gbc);

        gbc.gridx = 1;
        frame.add(guardianField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(emergencyContactLabel, gbc);

        gbc.gridx = 1;
        frame.add(emergencyContactField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(submitButton, gbc);

        gbc.gridx = 1;
        frame.add(resetButton, gbc);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String fatherName = fatherNameField.getText();
                String motherName = motherNameField.getText();
                String day = (String) dayComboBox.getSelectedItem();
                String month = (String) monthComboBox.getSelectedItem();
                String year = (String) yearComboBox.getSelectedItem();
                String dob = day + "/" + month + "/" + year;

                String gender = maleRadio.isSelected() ? "Male" : femaleRadio.isSelected() ? "Female" : "Other";
                String religion = hinduRadio.isSelected() ? "Hindu" : 
                                  muslimRadio.isSelected() ? "Muslim" : 
                                  christianRadio.isSelected() ? "Christian" : "Other";
                String bloodGroup = "";
                if (aPlus.isSelected()) bloodGroup += "A+ ";
                if (aMinus.isSelected()) bloodGroup += "A- ";
                if (bPlus.isSelected()) bloodGroup += "B+ ";
                if (bMinus.isSelected()) bloodGroup += "B- ";
                if (oPlus.isSelected()) bloodGroup += "O+ ";
                if (oMinus.isSelected()) bloodGroup += "O- ";
                if (abPlus.isSelected()) bloodGroup += "AB+ ";
                if (abMinus.isSelected()) bloodGroup += "AB- ";

                String sscCgpa = sscCgpaField.getText();
                String hscCgpa = hscCgpaField.getText();
                
                String presentAddress = presentAddressField.getText();
                String permanentAddress = sameAsPresentAddress.isSelected() ? presentAddress : permanentAddressField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                String guardianName = guardianField.getText();
                String emergencyContact = emergencyContactField.getText();

                String department = (String) departmentComboBox.getSelectedItem();

                String message = "Name: " + name + "\nFather's Name: " + fatherName + "\nMother's Name: " + motherName +
                                 "\nDate of Birth: " + dob + "\nGender: " + gender + "\nReligion: " + religion + 
                                 "\nBlood Group: " + bloodGroup.trim() +
                                 "\nSSC CGPA: " + sscCgpa + "\nHSC CGPA: " + hscCgpa +
                                 "\nDepartment: " + department +
                                 "\nPresent Address: " + presentAddress + "\nPermanent Address: " + permanentAddress +
                                 "\nEmail: " + email + "\nPhone: " + phone +
                                 "\nGuardian Name: " + guardianName + "\nEmergency Contact: " + emergencyContact;
                JOptionPane.showMessageDialog(frame, message, "Admission Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                fatherNameField.setText("");
                motherNameField.setText("");
                dayComboBox.setSelectedIndex(0);
                monthComboBox.setSelectedIndex(0);
                yearComboBox.setSelectedIndex(0);
                genderGroup.clearSelection();
                religionGroup.clearSelection(); 
                bloodGroupGroup.clearSelection();
                presentAddressField.setText("");
                permanentAddressField.setText("");
                emailField.setText("");
                phoneField.setText("");
                guardianField.setText("");
                emergencyContactField.setText("");
                sameAsPresentAddress.setSelected(false);
                sscCgpaField.setText("");
                hscCgpaField.setText("");
                departmentComboBox.setSelectedIndex(0);
            }
        });

        sameAsPresentAddress.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sameAsPresentAddress.isSelected()) {
                    permanentAddressField.setText(presentAddressField.getText());
                    permanentAddressField.setEditable(false);  
                } else {
                    permanentAddressField.setEditable(true);  
                    permanentAddressField.setText("");
                }
            }
        });

        frame.setVisible(true);
    }
}
