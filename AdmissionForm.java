package assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdmissionForm {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Student Admission Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 750);  // Increase height to accommodate new field
        frame.setLayout(new GridLayout(13, 2));  // Increase row count to 13

        // Create labels and text fields
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        
        JLabel dobLabel = new JLabel("Date of Birth (dd/MM/yyyy):");
        JTextField dobField = new JTextField();
        
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

        // Father's Name field added before Present Address
        JLabel fatherNameLabel = new JLabel("Father's Name:");
        JTextField fatherNameField = new JTextField();

        JLabel presentAddressLabel = new JLabel("Present Address:");
        JTextArea presentAddressField = new JTextArea(3, 20);
        JScrollPane presentAddressScroll = new JScrollPane(presentAddressField);

        JLabel permanentAddressLabel = new JLabel("Permanent Address:");
        JTextArea permanentAddressField = new JTextArea(3, 20);
        JScrollPane permanentAddressScroll = new JScrollPane(permanentAddressField);
        
        // Checkbox for same permanent address as present address (this will be on the same line as permanent address)
        JCheckBox sameAsPresentAddress = new JCheckBox("Same as Present Address");

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        
        JLabel phoneLabel = new JLabel("Phone:");
        JTextField phoneField = new JTextField();
        
        JLabel guardianLabel = new JLabel("Guardian Name:");
        JTextField guardianField = new JTextField();
        
        JLabel emergencyContactLabel = new JLabel("Emergency Contact:");
        JTextField emergencyContactField = new JTextField();
        
        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");
        
        // Add components to the frame
        frame.add(nameLabel);
        frame.add(nameField);
        
        frame.add(dobLabel);
        frame.add(dobField);
        
        frame.add(genderLabel);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        genderPanel.add(otherRadio);
        frame.add(genderPanel);
        
        frame.add(bloodGroupLabel);
        JPanel bloodGroupPanel = new JPanel();
        bloodGroupPanel.setLayout(new GridLayout(4, 2)); // Two columns for blood group options
        bloodGroupPanel.add(aPlus);
        bloodGroupPanel.add(aMinus);
        bloodGroupPanel.add(bPlus);
        bloodGroupPanel.add(bMinus);
        bloodGroupPanel.add(oPlus);
        bloodGroupPanel.add(oMinus);
        bloodGroupPanel.add(abPlus);
        bloodGroupPanel.add(abMinus);
        frame.add(bloodGroupPanel);
        
        // Add Father's Name field to the form before Present Address
        frame.add(fatherNameLabel);
        frame.add(fatherNameField);
        
        frame.add(presentAddressLabel);
        frame.add(presentAddressScroll);
        
        frame.add(permanentAddressLabel);
        JPanel permanentAddressPanel = new JPanel();
        permanentAddressPanel.setLayout(new BorderLayout());  // This ensures the checkbox stays inline
        permanentAddressPanel.add(permanentAddressScroll, BorderLayout.CENTER);
        permanentAddressPanel.add(sameAsPresentAddress, BorderLayout.SOUTH); // Place checkbox below
        frame.add(permanentAddressPanel);
        
        frame.add(emailLabel);
        frame.add(emailField);
        
        frame.add(phoneLabel);
        frame.add(phoneField);
        
        frame.add(guardianLabel);
        frame.add(guardianField);
        
        frame.add(emergencyContactLabel);
        frame.add(emergencyContactField);
        
        frame.add(submitButton);
        frame.add(resetButton);

        // Set action for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String dob = dobField.getText();
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

                // Display a confirmation message
                String message = "Name: " + name + "\nDate of Birth: " + dob + "\nGender: " + gender +
                                 "\nBlood Group: " + bloodGroup.trim() + "\nPresent Address: " + presentAddress +
                                 "\nPermanent Address: " + permanentAddress + "\nFather's Name: " + fatherName +
                                 "\nEmail: " + email + "\nPhone: " + phone + "\nGuardian Name: " + guardianName +
                                 "\nEmergency Contact: " + emergencyContact;
                JOptionPane.showMessageDialog(frame, message, "Admission Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Set action for the reset button
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                dobField.setText("");
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
                fatherNameField.setText("");  // Clear Father's Name field
                emailField.setText("");
                phoneField.setText("");
                guardianField.setText("");
                emergencyContactField.setText("");
                sameAsPresentAddress.setSelected(false);  // Reset checkbox
            }
        });

        // Add action to the checkbox to copy present address to permanent address
        sameAsPresentAddress.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sameAsPresentAddress.isSelected()) {
                    permanentAddressField.setText(presentAddressField.getText());
                    permanentAddressField.setEditable(false);  // Make it uneditable
                } else {
                    permanentAddressField.setEditable(true);  // Allow manual editing
                    permanentAddressField.setText("");
                }
            }
        });

        frame.setVisible(true);
    }
}