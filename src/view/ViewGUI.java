package view;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.db4o.ObjectSet;

import controller.BuscaCompra;
import controller.BuscaComputador;
import controller.BuscaFunc;
import controller.BuscaFuncionario;
import model.Computador;
import model.Funcionario;
import model.HistoricoCompra;

/**
 * 
 * @author Raquel
 */
public class ViewGUI extends javax.swing.JFrame implements Observer {

	/**
	 * Creates new form ViewGUI
	 */
	public ViewGUI() {
		list = new LinkedList();
		initComponents();
		
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		jScrollPane1 = new javax.swing.JScrollPane();
		jList1 = new javax.swing.JList();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jList1.addListSelectionListener(listSelectionListener);
		jTextField1.setVisible(false);
		jButton1.setVisible(false);
		jButton2.setVisible(false);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		ArrayList<String> stringsLista = new ArrayList();
		jList1.setModel(new javax.swing.AbstractListModel() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane1.setViewportView(jList1);
		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel1.setText("Resultados");
		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel2.setText("Detalhes");
		jButton1.setText("Pesquisar");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jButton2.setText("Limpar");
		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane3.setViewportView(jTextArea1);
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addGap(44, 44, 44)
								.addGroup(layout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												layout.createSequentialGroup()
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel1).addComponent(jTextField1,
																		javax.swing.GroupLayout.DEFAULT_SIZE, 192,
																		Short.MAX_VALUE))
										.addGap(18, 18, 18)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jLabel2)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGap(54, 54, 54))
								.addGroup(layout.createSequentialGroup()
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(44, 44, 44)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(41, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(jLabel2))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jScrollPane1).addComponent(jScrollPane3))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jButton1).addComponent(jTextField1,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(3, 3, 3).addComponent(jButton2)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jButton1ActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ViewGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ViewGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ViewGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ViewGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ViewGUI().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JList jList1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

	private BuscaComputador buscaComputador;

	public void setBuscaComputador(BuscaComputador buscaComputador) {
		this.buscaComputador = buscaComputador;
	}

	public void setBuscaFunc(BuscaFunc buscaFunc) {
		this.buscaFunc = buscaFunc;
	}

	public void setBuscaCompra(BuscaCompra buscaCompra) {
		this.buscaCompra = buscaCompra;
	}

	public void setList(ObjectSet list) {
		this.list = list;
	}

	private BuscaFunc buscaFunc;
	private BuscaCompra buscaCompra;
	private List list;
	private boolean isBuscaCDetalhada;

	public boolean isBuscaCDetalhada() {
		return isBuscaCDetalhada;
	}

	public void setBuscaCDetalhada(boolean isBuscaCDetalhada) {
		this.isBuscaCDetalhada = isBuscaCDetalhada;
	}

	private boolean isBuscaCSimples;

	public boolean isBuscaCSimples() {
		return isBuscaCSimples;
	}

	public void setBuscaCSimples(boolean isBuscaCSimples) {
		this.isBuscaCSimples = isBuscaCSimples;
	}

	public boolean isBuscaEstoque() {
		return isBuscaEstoque;
	}

	public void setBuscaEstoque(boolean isBuscaEstoque) {
		this.isBuscaEstoque = isBuscaEstoque;
	}

	public boolean isBuscaFDetalhada() {
		return isBuscaFDetalhada;
	}

	public void setBuscaFDetalhada(boolean isBuscaFDetalhada) {
		this.isBuscaFDetalhada = isBuscaFDetalhada;
	}

	public boolean isBuscaFSimples() {
		return isBuscaFSimples;
	}

	public void setBuscaFSimples(boolean isBuscaFSimples) {
		this.isBuscaFSimples = isBuscaFSimples;
	}

	public boolean isBuscaFuncionario() {
		return isBuscaFuncionario;
	}

	public void setBuscaFuncionario(boolean isBuscaFuncionario) {
		this.isBuscaFuncionario = isBuscaFuncionario;
	}

	private boolean isBuscaEstoque;
	private boolean isBuscaFDetalhada;
	private boolean isBuscaFSimples;
	private boolean isBuscaFuncionario;

	public void displayBuscaCDetalhada() {
		setBuscaFDetalhada(false);
		setBuscaCDetalhada(true);
		setBuscaCSimples(false);
		setBuscaEstoque(false);
		setBuscaFSimples(false);
		setBuscaFuncionario(false);
		if (!list.isEmpty()) {
			List<String> stringsLista;
			stringsLista = new LinkedList();
			for (Object i : list) {
				HistoricoCompra h1 = (HistoricoCompra) i;
				Format formatter = new SimpleDateFormat("yyyy-MM-dd");
				stringsLista.add((formatter.format(h1.getData())));
			}

			jList1.setModel(new javax.swing.AbstractListModel() {

				public int getSize() {
					return stringsLista.size();
				}

				public Object getElementAt(int i) {
					return stringsLista.get(i);
				}
			});
		}
		if (!list.isEmpty()) {
			for (Object i : list) {
				HistoricoCompra h1 = (HistoricoCompra) i;
				System.out.println("Compra detalhada:");
				// jList1.setModel( (ListModel) new JList(list.toArray()));
				System.out.println("ID da Compra:" + h1.getItemDaCompra().getIdComputador());
				System.out.println("ID do Funcionario:" + h1.getIdFuncionario());
				System.out.println("Data:" + h1.getData());
				System.out.println("Forma de Pagamento:" + h1.getFormaDePagamento());
				System.out.println("Quantidade Comprada:" + h1.getItemDaCompra().getQtdComprada());
				System.out.println("*****************");
			}
		} else {
			System.out.println("Nenhuma compra encontrada!");
		}

	}

	public void displayBuscaCSimples() {
		// TODO Auto-generated method stub
		setBuscaFDetalhada(false);
		setBuscaCDetalhada(false);
		setBuscaCSimples(true);
		setBuscaEstoque(false);
		setBuscaFSimples(false);
		setBuscaFuncionario(false);
		if (!list.isEmpty()) {
			List<String> stringsLista;
			stringsLista = new LinkedList();
			for (Object i : list) {
				HistoricoCompra h1 = (HistoricoCompra) i;
				Format formatter = new SimpleDateFormat("yyyy-MM-dd");
				stringsLista.add((formatter.format(h1.getData())));
			}

			jList1.setModel(new javax.swing.AbstractListModel() {

				public int getSize() {
					return stringsLista.size();
				}

				public Object getElementAt(int i) {
					return stringsLista.get(i);
				}
			});
		}
		if (!list.isEmpty()) {
			for (Object i : list) {
				HistoricoCompra h1 = (HistoricoCompra) i;
				System.out.println("Compra simples:");
				System.out.println("Data:" + h1.getData());
				System.out.println("*****************");
			}
		} else {
			System.out.println("Nenhuma compra encontrada");
		}

	}

	public void displayBuscaEstoque() {
		// TODO Auto-generated method stub
		setBuscaFDetalhada(false);
		setBuscaCDetalhada(false);
		setBuscaCSimples(false);
		setBuscaEstoque(true);
		setBuscaFSimples(false);
		setBuscaFuncionario(false);
		if (!list.isEmpty()) {
			List<String> stringsLista;
			stringsLista = new LinkedList();
			for (Object i : list) {
				Computador c1 = (Computador) i;
				stringsLista.add(c1.getSpecComputador().getModelo());
			}

			jList1.setModel(new javax.swing.AbstractListModel() {

				public int getSize() {
					return stringsLista.size();
				}

				public Object getElementAt(int i) {
					return stringsLista.get(i);
				}
			});
		}
		if (!list.isEmpty()) {
			for (Object i : list) {
				Computador c1 = (Computador) i;
				System.out.println("Busca do computador efetuada pelo estoque");
				System.out.println("Numero do computador:" + c1.getIDComputador());
				System.out.println("*****************");
			}
		}
	}

	public void displayBuscaFDetalhada() {
		// TODO Auto-generated method stub
		setBuscaFDetalhada(true);
		setBuscaCDetalhada(false);
		setBuscaCSimples(false);
		setBuscaEstoque(false);
		setBuscaFSimples(false);
		setBuscaFuncionario(false);
		if (!list.isEmpty()) {
			List<String> stringsLista;
			stringsLista = new LinkedList();
			for (Object i : list) {
				Funcionario f1 = (Funcionario) i;

				stringsLista.add(f1.getNomeFunc());
			}

			jList1.setModel(new javax.swing.AbstractListModel() {

				public int getSize() {
					return stringsLista.size();
				}

				public Object getElementAt(int i) {
					return stringsLista.get(i);
				}
			});
		}
		if (!list.isEmpty()) {
			for (Object i : list) {

				Funcionario f1 = (Funcionario) i;
				System.out.println("Busca detalhada do Funcionario");
				System.out.println("ID do Funcionario:" + f1.getIdFunc());
				System.out.println("Nome do Funcionario:" + f1.getNomeFunc());
				System.out.println("CPF do Funcionario:" + f1.getCpf());
				System.out.println("Cod gerente do Funcionario:" + f1.getCodGerente());
				System.out.println("Salario do Funcionario:" + f1.getSalarioFunc());
				System.out.println("*****************");
			}
		} else
			System.out.println("Nenhum funcionario encontrado");
	}
	// list.remove(0);

	public void displayBuscaFSimples() {
		// TODO Auto-generated method stub
		setBuscaFDetalhada(false);
		setBuscaCDetalhada(false);
		setBuscaCSimples(false);
		setBuscaEstoque(false);
		setBuscaFuncionario(false);
		setBuscaFSimples(true);
		if (!list.isEmpty()) {
			List<String> stringsLista;
			stringsLista = new LinkedList();
			for (Object i : list) {
				Computador c1 = (Computador) i;

				stringsLista.add(c1.getSpecComputador().getModelo());
			}

			jList1.setModel(new javax.swing.AbstractListModel() {

				public int getSize() {
					return stringsLista.size();
				}

				public Object getElementAt(int i) {
					return stringsLista.get(i);
				}
			});
		}
		if (!list.isEmpty()) {
			for (Object i : list) {
				Funcionario f1 = (Funcionario) i;
				System.out.println("Busca simples do Funcionario");
				System.out.println("Salario do Funcionario:" + f1.getSalarioFunc());
				System.out.println("*****************");
			}
		} else
			System.out.println("Nenhum funcionario foi encontrado");
		// list.remove(0);
	}

	public void displayBuscaFuncionario() {
		// TODO Auto-generated method stub
		setBuscaFDetalhada(false);
		setBuscaCDetalhada(false);
		setBuscaCSimples(false);
		setBuscaEstoque(false);
		setBuscaFuncionario(true);
		setBuscaFSimples(false);
		if (!list.isEmpty()) {
			List<String> stringsLista;
			stringsLista = new LinkedList();
			for (Object i : list) {
				Computador c1 = (Computador) i;

				stringsLista.add(c1.getSpecComputador().getModelo());
			}

			jList1.setModel(new javax.swing.AbstractListModel() {

				public int getSize() {
					return stringsLista.size();
				}

				public Object getElementAt(int i) {
					return stringsLista.get(i);
				}
			});
		}

		if (!list.isEmpty()) {
			for (Object i : list) {
				Computador c1 = (Computador) i;
				System.out.println("Busca de computador efetuada pelo funcionario");
				System.out.println("Numero do computador:" + c1.getIDComputador());
				System.out.println("Preco do computador:" + c1.getPreco());
				System.out.println("Quantidade disponivel do computador:" + c1.getQtdDisponivel());
				System.out.println("*****************");
			}
		} else
			System.out.print("Nenhum computador encontrado");
		// list.remove(0);
	}

	@Override
	public void updateComputador(List l) {
		// TODO Auto-generated method stub
		list = l;

		buscaComputador.buscarComputador();

	}

	@Override
	public void updateComputador(String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateFuncionario(List l) {
		// TODO Auto-generated method stub
		list = l;
		buscaFunc.buscarFunc();

	}

	@Override
	public void updateFuncionario(String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCompra(List l) {
		// TODO Auto-generated method stub
		list = l;
		buscaCompra.buscarCompra();
	}

	@Override
	public void updateCompra(String msg) {
		// TODO Auto-generated method stub

	}
	
	private ListSelectionListener listSelectionListener = new ListSelectionListener() {
		@Override
		public void valueChanged(ListSelectionEvent arg0) {
			// TODO Auto-generated method stub
			if (isBuscaCSimples() == true) {
				if (!list.isEmpty()) {
					for (Object i : list) {
						HistoricoCompra h1 = (HistoricoCompra) i;
						Format formatter = new SimpleDateFormat("yyyy-MM-dd");
						//System.out.println(
							//	formatter.format(h1.getData()).compareTo(jList1.getSelectedValue().toString()) == 0);
						//System.out.println(jList1.getSelectedValue().toString());
						// System.out.println(h1.getData().toString());
						if (formatter.format(h1.getData()).compareTo(jList1.getSelectedValue().toString()) == 0) {
							jTextArea1.setText("Compra simples:\n" + "Data:\n" + h1.getData() + "*****************\n");
						}
					}
				} else {
					System.out.println("Nenhuma compra encontrada");
				}
			} else if (isBuscaCDetalhada() == true) {
				if (!list.isEmpty()) {
					for (Object i : list) {
						HistoricoCompra h1 = (HistoricoCompra) i;
						Format formatter = new SimpleDateFormat("yyyy-MM-dd");
				
					
						// System.out.println(h1.getData().toString());
						if (formatter.format(h1.getData()).compareTo(jList1.getSelectedValue().toString()) == 0) {
							jTextArea1.setText("ID da Compra:" + h1.getItemDaCompra().getIdComputador()
									+ "\nID do Funcionario:" + h1.getIdFuncionario() + "\nData:" + h1.getData()
									+ "\nForma de Pagamento:" + h1.getFormaDePagamento() +"\nQuantidade:"+
									+ +h1.getItemDaCompra().getQtdComprada() + "*****************");
						}
					}
				} else {
					System.out.println("Nenhuma compra encontrada");
				}
			} else if (isBuscaFDetalhada() == true) {
				if (!list.isEmpty()) {
					for (Object i : list) {
						Funcionario f1 = (Funcionario) i;
						if (f1.getNomeFunc() == jList1.getSelectedValue()) {
							jTextArea1.setText("Busca detalhada" + "\nID:" + f1.getIdFunc() + "\nNome:"
									+ f1.getNomeFunc() + "\nCPF:" + f1.getCpf() + "\nCod gerente:" + f1.getCodGerente()
									+ "\nSalario:" + f1.getSalarioFunc() + "\n*****************");
						}
					}
				} else
					System.out.println("Nenhum funcionario encontrado");
			} else if (isBuscaFSimples() == true) {
				if (!list.isEmpty()) {
					for (Object i : list) {
						Funcionario f1 = (Funcionario) i;
						if (f1.getNomeFunc() == jList1.getSelectedValue()) {
							jTextArea1.setText("Busca simples\n" + "\nSalario do Funcionario:" + f1.getSalarioFunc()
									+ "\n*****************");
						}
					}
				} else {
					System.out.println("Nenhum funcionario encontrado");
				}
			} else if (isBuscaEstoque() == true) {
				if (!list.isEmpty()) {
					for (Object i : list) {
						Computador c1 = (Computador) i;
						if (c1.getSpecComputador().getModelo() == jList1.getSelectedValue()) {
							jTextArea1.setText("Busca estoque" + "Numero do computador:" + c1.getIDComputador()
									+ "*****************");
						}
					}
				} else {
					System.out.println("Nenhum computador encontrado");
				}
			} else if (isBuscaFuncionario() == true) {
				if (!list.isEmpty()) {
					for (Object i : list) {
						Computador c1 = (Computador) i;
						if (c1.getSpecComputador().getModelo() == jList1.getSelectedValue()) {
							jTextArea1.setText("Busca de computador\n" + "\nNumero:" + c1.getIDComputador() + "\nPreco:"
									+ c1.getPreco() + "\nQuantidade disponivel:" + c1.getQtdDisponivel()
									+ "\n*****************");
						}
					}
				} else {
					System.out.println("Nenhum computador encontrado");
				}
			}
		}

	};
}