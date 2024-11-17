package project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdmissionForm {
    public static void main(String[] args) {

        // Create the main frame
        JFrame frame = new JFrame("Student Admission Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title label
        JLabel titleLabel = new JLabel("METROPOLITAN UNIVERSITY");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setForeground(Color.blue);

        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(titleLabel, gbc);

        gbc.gridwidth = 1;
        gbc.gridy++;

        // Student name
        JLabel nameLabel = new JLabel("Student Name:");
        JTextField nameField = new JTextField(20);

        // Father's name
        JLabel fatherNameLabel = new JLabel("Father's Name:");
        JTextField fatherNameField = new JTextField(20);

        // Mother's name
        JLabel motherNameLabel = new JLabel("Mother's Name:");
        JTextField motherNameField = new JTextField(20);

        // Date of Birth
        JLabel dobLabel = new JLabel("Date of Birth:");
        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.format("%02d", i + 1);
        }
        JComboBox<String> dayComboBox = new JComboBox<>(days);

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        JComboBox<String> monthComboBox = new JComboBox<>(months);

        String[] years = new String[35];
        for (int i = 0; i < years.length; i++) {
            years[i] = String.valueOf(2024 - i);
        }
        JComboBox<String> yearComboBox = new JComboBox<>(years);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        JRadioButton otherRadio = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderGroup.add(otherRadio);

        // Religion
        JLabel religionLabel = new JLabel("Religion:");
        JRadioButton hinduRadio = new JRadioButton("Muslim");
        JRadioButton muslimRadio = new JRadioButton("Hindu");
        JRadioButton christianRadio = new JRadioButton("Christian");
        JRadioButton otherReligionRadio = new JRadioButton("Other");
        ButtonGroup religionGroup = new ButtonGroup();
        religionGroup.add(hinduRadio);
        religionGroup.add(muslimRadio);
        religionGroup.add(christianRadio);
        religionGroup.add(otherReligionRadio);

        // Blood Group
        JLabel bloodGroupLabel = new JLabel("Blood Group:");
        JComboBox<String> bloodGroupComboBox = new JComboBox<>(new String[]{"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"});

        // SSC and HSC GPA
        JLabel sscCgpaLabel = new JLabel("SSC GPA:");
        JTextField sscCgpaField = new JTextField(10);

        JLabel hscCgpaLabel = new JLabel("HSC GPA:");
        JTextField hscCgpaField = new JTextField(10);

        // Address fields
        JLabel presentAddressLabel = new JLabel("Present Address:");
        JTextArea presentAddressField = new JTextArea(3, 20);
        JScrollPane presentAddressScroll = new JScrollPane(presentAddressField);

        JLabel permanentAddressLabel = new JLabel("Permanent Address:");
        JTextArea permanentAddressField = new JTextArea(3, 20);
        JScrollPane permanentAddressScroll = new JScrollPane(permanentAddressField);

        JCheckBox sameAsPresentAddress = new JCheckBox("Same as Present Address");

        // Email and Phone
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JLabel phoneLabel = new JLabel("Phone:");
        JTextField phoneField = new JTextField(20);

        // Guardian and Emergency Contact
        JLabel guardianLabel = new JLabel("Guardian Name:");
        JTextField guardianField = new JTextField(20);

        JLabel emergencyContactLabel = new JLabel("Emergency Contact:");
        JTextField emergencyContactField = new JTextField(20);

        // Department selection
        JLabel departmentLabel = new JLabel("Choose Department:");
        String[] departments = {"Computer Science", "Electrical Engineering", "Software Engineering",
                "Economics", "English", "Law And Justice", "BBA"};
        JComboBox<String> departmentComboBox = new JComboBox<>(departments);

        // Batch and Student ID
        JLabel batchLabel = new JLabel("Batch:");
        JTextField batchField = new JTextField(10);  // Optional field

        JLabel studentIdLabel = new JLabel("Student ID:");
        JTextField studentIdField = new JTextField(20);

        // Submit and Reset buttons
        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");

        // JTable to display submitted data
        String[] columnNames = {"Name", "Father's Name", "Mother's Name", "DOB", "Gender", "Religion", "Blood Group", "SSC GPA", "HSC GPA", "Present Address", "Permanent Address", "Email", "Phone", "Guardian", "Emergency Contact", "Department", "Batch", "Student ID"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);

        // Initially hide the JTable
        tableScrollPane.setVisible(false);

        // Adding components to the form panel
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(nameLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(fatherNameLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(fatherNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(motherNameLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(motherNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(dobLabel, gbc);
        JPanel datePanel = new JPanel();
        datePanel.add(dayComboBox);
        datePanel.add(new JLabel("/"));
        datePanel.add(monthComboBox);
        datePanel.add(new JLabel("/"));
        datePanel.add(yearComboBox);
        gbc.gridx = 1;
        formPanel.add(datePanel, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(genderLabel, gbc);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        genderPanel.add(otherRadio);
        gbc.gridx = 1;
        formPanel.add(genderPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(religionLabel, gbc);
        JPanel religionPanel = new JPanel();
        religionPanel.add(hinduRadio);
        religionPanel.add(muslimRadio);
        religionPanel.add(christianRadio);
        religionPanel.add(otherReligionRadio);
        gbc.gridx = 1;
        formPanel.add(religionPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(bloodGroupLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(bloodGroupComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(sscCgpaLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(sscCgpaField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(hscCgpaLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(hscCgpaField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(presentAddressLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(presentAddressScroll, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(permanentAddressLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(permanentAddressScroll, gbc);

        gbc.gridx = 1;
        gbc.gridy++;
        formPanel.add(sameAsPresentAddress, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(emailLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(phoneLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(phoneField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(guardianLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(guardianField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(emergencyContactLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(emergencyContactField, gbc);

        // Add department selection
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(departmentLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(departmentComboBox, gbc);

        // Add batch and student ID after department
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(batchLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(batchField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(studentIdLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(studentIdField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(submitButton, gbc);
        gbc.gridx = 1;
        formPanel.add(resetButton, gbc);

        // Wrap the form panel in a JScrollPane
        JScrollPane formScrollPane = new JScrollPane(formPanel);
        formScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Add formScrollPane and table to the frame
        frame.add(formScrollPane, BorderLayout.CENTER);
        frame.add(tableScrollPane, BorderLayout.SOUTH);

        // Action listeners for the buttons
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Collect data and validate
                String name = nameField.getText().trim();
                String fatherName = fatherNameField.getText().trim();
                String motherName = motherNameField.getText().trim();
                String email = emailField.getText().trim();
                String phone = phoneField.getText().trim();
                String sscCgpa = sscCgpaField.getText().trim();
                String hscCgpa = hscCgpaField.getText().trim();
                String department = (String) departmentComboBox.getSelectedItem();
                String batch = batchField.getText().trim();  // Optional field
                String studentId = studentIdField.getText().trim();

                // Basic validation for required fields
                if (name.isEmpty() || fatherName.isEmpty() || motherName.isEmpty() || email.isEmpty() || phone.isEmpty() ||
                        sscCgpa.isEmpty() || hscCgpa.isEmpty() || studentId.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all required fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Append @gmail.com if not already present
                if (!email.contains("@")) {
                    email += "@gmail.com";
                } else if (!email.endsWith("@gmail.com")) {
                    JOptionPane.showMessageDialog(frame, "Only @gmail.com domain is allowed.", "Invalid Email", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Validate GPA input
                try {
                    double sscGpa = Double.parseDouble(sscCgpa);
                    double hscGpa = Double.parseDouble(hscCgpa);
                    if (sscGpa < 0.00 || sscGpa > 5.00 || hscGpa < 0.00 || hscGpa > 5.00) {
                        JOptionPane.showMessageDialog(frame, "GPA should be between 0 and 5.", "Input Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numerical values for GPA.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Collect remaining data
                String day = (String) dayComboBox.getSelectedItem();
                String month = (String) monthComboBox.getSelectedItem();
                String year = (String) yearComboBox.getSelectedItem();
                String dob = day + "/" + month + "/" + year;

                String gender = maleRadio.isSelected() ? "Male" : femaleRadio.isSelected() ? "Female" : "Other";
                String religion = hinduRadio.isSelected() ? "Hindu" : muslimRadio.isSelected() ? "Muslim" :
                        christianRadio.isSelected() ? "Christian" : "Other";
                String bloodGroup = (String) bloodGroupComboBox.getSelectedItem();

                String presentAddress = presentAddressField.getText().trim();
                String permanentAddress = sameAsPresentAddress.isSelected() ? presentAddress : permanentAddressField.getText().trim();

                String guardianName = guardianField.getText().trim();
                String emergencyContact = emergencyContactField.getText().trim();

                // Add data to the table
                tableModel.addRow(new Object[]{name, fatherName, motherName, dob, gender, religion, bloodGroup,
                        sscCgpa, hscCgpa, presentAddress, permanentAddress, email, phone, guardianName, emergencyContact, department, batch, studentId});

                // Show JTable after submission
                tableScrollPane.setVisible(true);
                frame.revalidate();

                // Show message dialog with the collected information
                JOptionPane.showMessageDialog(frame, "Data Submitted Successfully", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset all fields
                nameField.setText("");
                fatherNameField.setText("");
                motherNameField.setText("");
                dayComboBox.setSelectedIndex(0);
                monthComboBox.setSelectedIndex(0);
                yearComboBox.setSelectedIndex(0);
                genderGroup.clearSelection();
                religionGroup.clearSelection();
                bloodGroupComboBox.setSelectedIndex(0);
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
                batchField.setText("");  // Optional field reset
                studentIdField.setText("");
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

        // Make frame visible
        frame.setVisible(true);
    }
}
