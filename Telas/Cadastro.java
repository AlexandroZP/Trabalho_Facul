package Telas;

import Services.Autenticação.*;


public class Cadastro extends javax.swing.JFrame {
    // Tela de cadastro
    public Cadastro() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
                       
    private void initComponents() {

        labelEmail = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        textFieldEmail = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        textFieldPassword = new javax.swing.JTextField();
        labelConPassword = new javax.swing.JLabel();
        textFieldConPassword = new javax.swing.JTextField();
        comboBoxProf = new javax.swing.JComboBox<>();
        radioButtonClient = new javax.swing.JRadioButton();
        radioButtonProf = new javax.swing.JRadioButton();
        labelUserType = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Cadastro");
        labelEmail.setText("Email:");

        registerButton.setText("Cadastrar");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });

        labelPassword.setText("Digite a senha:");

        textFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPasswordActionPerformed(evt);
            }
        });

        labelConPassword.setText("Digite a senha novamente:");

        comboBoxProf.setEditable(true);
        comboBoxProf.setEnabled(false);
        comboBoxProf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Advogado", "Veterinario", "Médico", "Mecânico" }));
        comboBoxProf.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                comboBoxProfAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        comboBoxProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProfActionPerformed(evt);
                
            }
        });

        radioButtonClient.setText("Cliente");
        radioButtonClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonClientActionPerformed(evt);
            }
        });

        radioButtonProf.setText("Profissional");
        radioButtonProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonProfActionPerformed(evt);
            }
        });

        labelUserType.setText("Selecione o tipo de Usuário:");

        jLabel1.setText("Qual sua Profissão ?");

        jLabel2.setText("Já tem seu cadsatro ?");

        jButton1.setText("Tela de Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              jButton1ActionPerformed(evt);
              
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboBoxProf, javax.swing.GroupLayout.Alignment.LEADING, 0, 270, Short.MAX_VALUE)
                            .addComponent(textFieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldConPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUserType, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelConPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(radioButtonClient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonProf)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelConPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldConPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(labelUserType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonClient)
                    .addComponent(radioButtonProf))
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(registerButton)
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }                       

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void textFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void radioButtonClientActionPerformed(java.awt.event.ActionEvent evt) {                                                  
      // Se o radi cliente estar selecionado o radi do prof é desmarcado
      radioButtonProf.setSelected(false);
      // E a combobox é bloqueada
      comboBoxProf.setEnabled(false);
    }                                                 

    private void radioButtonProfActionPerformed(java.awt.event.ActionEvent evt) {
      // Se o radi prof for selecinado o radi cliente é desmarcado
      radioButtonClient.setSelected(false);
      // E a comboBox é desbloqueada
      comboBoxProf.setEnabled(true);
    }                                               

    private void comboBoxProfActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void comboBoxProfAncestorAdded(javax.swing.event.AncestorEvent evt) {                                           
        // TODO add your handling code here:
    }                                          
    
    
  private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    // Checa se o cliente esta marcada
    boolean client = radioButtonClient.isSelected();
    String perfil = " ";
    if(client){
      perfil = "Cliente";
    }else if(String.valueOf(comboBoxProf.getSelectedItem()) != " "){
      perfil = String.valueOf(comboBoxProf.getSelectedItem()); 
    }
    // Você precisa escolher uma opção
    if(client == false && radioButtonProf.isSelected() == false){
      System.out.println("Por favor selecione uma das opções de perfil");
    }else{
      AutenticarCadastro autenticar = new AutenticarCadastro();                      
      autenticar.AuntenticaCadastro(textFieldEmail.getText(), textFieldPassword.getText(), textFieldConPassword.getText(), perfil);
    }   

    }                                              

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
      //Ao clicar no botão tela de login vai chama a tela de login
      new TelasBackend().ChamarTelaInicial();
      dispose();
    }                                        


 
    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> comboBoxProf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelConPassword;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUserType;
    private javax.swing.JRadioButton radioButtonClient;
    private javax.swing.JRadioButton radioButtonProf;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField textFieldConPassword;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldPassword;
    // End of variables declaration                   
}