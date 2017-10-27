
package insertdatabase;

import insertdatabase.UI.MyTableView;

/**
 *
 * @author Hirantha
 */
public class InsertDataBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //JFrame ekak haduwama eke main method eke thiyena look and feel lines tika e me,copy paste kara
        //ita psse ewage main method delete kara
        // me line tika nathi unoth mokada wenne balnna ;D
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                //nimbus -> Windows
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyTableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyTableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyTableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyTableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        MyTableView mtv = new MyTableView();
        mtv.setLocationRelativeTo(null); //center in display
        mtv.setVisible(true);  //visible
    }
    
}
