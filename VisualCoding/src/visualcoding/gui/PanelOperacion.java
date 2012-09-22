package visualcoding.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class PanelOperacion extends JPanel {
	private JTextField _Textovaloroperacion;

	/**
	 * @author Jose David
	 * l
	 * 
	 * 
	 * carajo que hago
	 * jajajaj
	 * ya estallo esta madre
	 * 
	 */
	
	public PanelOperacion() {
		setLayout(null);
		
		JLabel lblOperacion = new JLabel("Operacion");
		lblOperacion.setBounds(100, 25, 49, 14);
		add(lblOperacion);
		
		JLabel lblValorDeOperacion = new JLabel("Valor de Operacion");
		lblValorDeOperacion.setBounds(26, 53, 102, 14);
		add(lblValorDeOperacion);
		
		_Textovaloroperacion = new JTextField();
		_Textovaloroperacion.setBounds(143, 50, 86, 20);
		add(_Textovaloroperacion);
		_Textovaloroperacion.setColumns(10);
		
		JLabel lblPropiedadAOperar = new JLabel("Propiedad a Operar");
		lblPropiedadAOperar.setBounds(26, 84, 102, 14);
		add(lblPropiedadAOperar);
		
		JComboBox _CBpropiedad = new JComboBox();
		_CBpropiedad.setBounds(143, 81, 86, 20);
		add(_CBpropiedad);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(143, 112, 86, 20);
		add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("Operacion");
		lblNewLabel.setBounds(26, 115, 102, 14);
		add(lblNewLabel);
		
		
		
		

	}
}
