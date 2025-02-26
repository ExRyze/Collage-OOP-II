package item;

import java.awt.BorderLayout;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import components.V_PanelAtas;
import components.V_PanelBawah;

public class V_ListItem extends JInternalFrame {
	private JTable table;
	private ATBM_Item tItem;
	private V_PanelAtas panelAtas;
	private V_PanelBawah panelBawah;
	
	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public ATBM_Item getTBM() {
		return tItem;
	}

	public void setTBM(ATBM_Item tItem) {
		this.tItem = tItem;
	}

	public V_ListItem() {
		super("List Item");
		panelAtas = new V_PanelAtas();
		panelAtas.getBtnHapus().setText("Delete");
		getContentPane().add(panelAtas,BorderLayout.NORTH);
		panelBawah = new V_PanelBawah();
		getContentPane().add(panelBawah,BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		tItem = new ATBM_Item();
		table.setModel(tItem);
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.getColumnModel().getColumn(3).setPreferredWidth(200);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setPreferredWidth(500);
		table.getColumnModel().getColumn(7).setPreferredWidth(200);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(table);
	}
	
	public V_PanelAtas getPanelAtas() {
		return panelAtas;
	}
	
	public V_PanelBawah getPanelBawah() {
		return panelBawah;
	}
}
