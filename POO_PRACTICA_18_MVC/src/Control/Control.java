
package Control;
import Modelo.Modelo;
import Vista.Vista;
 import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Control implements ActionListener {
    
    private Vista view;
    private Modelo model;
 
    public Control(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnSumar.addActionListener(this);
        this.view.btnResta.addActionListener(this);
        this.view.btnmulti.addActionListener(this);
        this.view.btnDivi.addActionListener(this);
        
    }
    public void iniciar(){
        view.setTitle("CALCULADORA");
        view.setLocationRelativeTo(null);
        view.txtN1.setText(String.valueOf(model.getV1()));
        view.txtN2.setText(String.valueOf(model.getV2()));
        view.txtResult.setText(String.valueOf(model.getTotal1()));
    }
    @Override
      public void actionPerformed(ActionEvent  e){
        model.setV1(Integer.parseInt(view.txtN1.getText()));
        model.setV2(Integer.parseInt(view.txtN2.getText()));
        if (e.getSource()==view.btnSumar){
            model.sumar();
        }
        if (e.getSource()==view.btnResta){
            model.restar();
        }
        if(e.getSource()==view.btnmulti){
            model.multi();
        }
        if(e.getSource()==view.btnDivi){
            model.divi();
        }
        view.txtResult.setText(String.valueOf(model.getTotal1()));
      }
    
 
   
}
