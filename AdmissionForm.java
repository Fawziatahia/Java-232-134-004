package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdmissionForm {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Student Admission Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 800);  // Increase height to accommodate new fields
        frame.setLayout(new GridBagLayout());  // Using GridBagLayout for better control

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);  // Space between components

        // Create labels and text fields
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        
        JLabel dobLabel = new JLabel("Date of Birth (dd/MM/yyyy):");

        // Day, Month, Year combo boxes
        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.format("%02d", i + 1);
        }
        JComboBox<String> dayComboBox = new JComboBox<>(days);

        String[] months = new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        JComboBox<String> monthComboBox = new JComboBox<>(months);
        
        String[] years = new String[35];
        for (int i = 0; i < years.length; i++) {
            years[i] = String.valueOf(2024 - i);  // Years from 2024 to 1990
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

        JLabel bloodGroupLabel = new JLabel("Blood Group:");
        JCheckBox aPlus = new JCheckBox("A+");
        JCheckBox aMinus = new JCheckBox("A-");
        JCheckBox bPlus = new JCheckBox("B+");
        JCheckBox bMinus = new JCheckBox("B-");
        JCheckBox oPlus = new JCheckBox("O+");
        JCheckBox oMinus = new JCheckBox("O-");
        JCheckBox abPlus = new JCheckBox("AB+");
        JCheckBox abMinus = new JCheckBox("AB-");

        JLabel fatherNameLabel = new JLabel("Father's Name:");
        JTextField fatherNameField = new JTextField(20);

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

        // Set GridBagConstraints for the components
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(nameLabel, gbc);

        gbc.gridx = 1;
        frame.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(dobLabel, gbc);

        // Adding date components (day, month, year)
        JPanel datePanel = new JPanel();
        datePanel.add(dayComboBox);
        datePanel.add(new JLabel("/"));
        datePanel.add(monthComboBox);
        datePanel.add(new JLabel("/"));
        datePanel.add(yearComboBox);

        gbc.gridx = 1;
        frame.add(datePanel, gbc);

        // Gender Section
        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(genderLabel, gbc);

        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        genderPanel.add(otherRadio);
        gbc.gridx = 1;
        frame.add(genderPanel, gbc);

        // Blood Group Section
        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(bloodGroupLabel, gbc);

        JPanel bloodGroupPanel = new JPanel();
        bloodGroupPanel.setLayout(new GridLayout(2, 4));  // Arrange blood groups in a 2x4 grid
        bloodGroupPanel.add(aPlus);
        bloodGroupPanel.add(aMinus);
        bloodGroupPanel.add(bPlus);
        bloodGroupPanel.add(bMinus);
        bloodGroupPanel.add(oPlus);
        bloodGroupPanel.add(oMinus);
        bloodGroupPanel.add(abPlus);
        bloodGroupPanel.add(abMinus);

        gbc.gridx = 1;
        frame.add(bloodGroupPanel, gbc);

        // Father's Name Section
        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(fatherNameLabel, gbc);

        gbc.gridx = 1;
        frame.add(fatherNameField, gbc);

        // Address Section
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

        // Contact Info Section
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

        // Buttons Section
        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(submitButton, gbc);

        gbc.gridx = 1;
        frame.add(resetButton, gbc);

  
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String day = (String) dayComboBox.getSelectedItem();
                String month = (String) monthComboBox.getSelectedItem();
                String year = (String) yearComboBox.getSelectedItem();
                String dob = day + "/" + month + "/" + year;

                String gender = maleRadio.isSelected() ? "Male" : femaleRadio.isSelected() ? "Female" : "Other";
                String bloodGroup = "";
                if (aPlus.isSelected()) bloodGroup += "A+ ";
                if (aMinus.isSelected()) bloodGroup += "A- ";
                if (bPlus.isSelected()) bloodGroup += "B+ ";
                if (bMinus.isSelected()) bloodGroup += "B- ";
                if (oPlus.isSelected()) bloodGroup += "O+ ";
                if (oMinus.isSelected()) bloodGroup += "O- ";
                if (abPlus.isSelected()) bloodGroup += "AB+ ";
                if (abMinus.isSelected()) bloodGroup += "AB- ";

                String presentAddress = presentAddressField.getText();
                String permanentAddress = sameAsPresentAddress.isSelected() ? presentAddress : permanentAddressField.getText();
                String fatherName = fatherNameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                String guardianName = guardianField.getText();
                String emergencyContact = emergencyContactField.getText();

                String message = "Name: " + name + "\nDate of Birth: " + dob +
                                 "\nGender: " + gender + "\nBlood Group: " + bloodGroup.trim() +
                                 "\nPresent Address: " + presentAddress + "\nPermanent Address: " + permanentAddress +
                                 "\nFather's Name: " + fatherName + "\nEmail: " + email + "\nPhone: " + phone +
                                 "\nGuardian Name: " + guardianName + "\nEmergency Contact: " + emergencyContact;
                JOptionPane.showMessageDialog(frame, message, "Admission Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                dayComboBox.setSelectedIndex(0);
                monthComboBox.setSelectedIndex(0);
                yearComboBox.setSelectedIndex(0);
                genderGroup.clearSelection();
                aPlus.setSelected(false);
                aMinus.setSelected(false);
                bPlus.setSelected(false);
                bMinus.setSelected(false);
                oPlus.setSelected(false);
                oMinus.setSelected(false);
                abPlus.setSelected(false);
                abMinus.setSelected(false);
                presentAddressField.setText("");
                permanentAddressField.setText("");
                fatherNameField.setText("");
                emailField.setText("");
                phoneField.setText("");
                guardianField.setText("");
                emergencyContactField.setText("");
                sameAsPresentAddress.setSelected(false);
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
