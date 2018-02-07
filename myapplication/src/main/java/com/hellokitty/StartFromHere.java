/*
 * StartFromHere.java
 *
 * Created on __DATE__, __TIME__
 */

package com.hellokitty;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author  __USER__
 */
public class StartFromHere extends javax.swing.JFrame {
	
	private QCodeTest qc = null;
	private String info;
	private String path;
	
	public QCodeTest getQc() {
		return qc;
	}

	public void setQc(QCodeTest qc) {
		this.qc = qc;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	/** Creates new form StartFromHere */
	public StartFromHere() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
        //String str = "朱礼礼 中南大学 软件学院 男";// 二维码内容
		//姓名：张三 年龄：20 性别：男 学校：中南大学
		//成绩: C语言:90 离散数学:95 大学生心理健康 69
		this.qc = new QCodeTest();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		ePathTF = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		ePicPNL = new PanelToDisplayPic();
		eScanBTN = new javax.swing.JButton();
		eInfoTF = new javax.swing.JTextField();
		eGenBTN = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		dPathTF = new javax.swing.JTextField();
		dScanBTN = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		dDecodeBTN = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		dDecodeTA = new javax.swing.JTextArea();
		eChooser = new JFileChooser();
		dChooser = new JFileChooser();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("\u8bf7\u9009\u62e9\u751f\u6210\u8def\u5f84:");

		jLabel2.setText("\u8bf7\u8f93\u5165\u52a0\u7801\u4fe1\u606f:");

		eScanBTN.setText("\u6d4f  \u89c8");
		eScanBTN.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				eScanBTNActionPerformed(evt);
			}
		});

		ePathTF.setEnabled(false);
		
		eGenBTN.setText("\u751f  \u6210");
		eGenBTN.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				eGenBTNActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																ePicPNL,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																355,
																Short.MAX_VALUE)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								eInfoTF,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								280,
																								Short.MAX_VALUE)
																						.addComponent(
																								ePathTF,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								280,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								eScanBTN)
																						.addComponent(
																								eGenBTN))))
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(eScanBTN)
														.addComponent(
																ePathTF,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																eInfoTF,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(eGenBTN))
										.addGap(18, 18, 18)
										.addComponent(
												ePicPNL,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												195, Short.MAX_VALUE)
										.addContainerGap()));

		jTabbedPane1.addTab("\u751f\u6210\u4e8c\u7ef4\u7801", jPanel1);

		jLabel3.setText("\u8bf7\u9009\u62e9\u89e3\u7801\u56fe\u7247:");

		dPathTF.setEnabled(false);

		dScanBTN.setText("\u6d4f  \u89c8");
		dScanBTN.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dScanBTNActionPerformed(evt);
			}
		});

		jLabel4.setText("\u89e3\u6790\u56fe\u7247\u5185\u5bb9:");

		dDecodeBTN.setText("\u89e3  \u6790");
		dDecodeBTN.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dDecodeBTNActionPerformed(evt);
			}
		});

		dDecodeTA.setColumns(20);
		dDecodeTA.setRows(5);
		jScrollPane2.setViewportView(dDecodeTA);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jScrollPane2,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																355,
																Short.MAX_VALUE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				dPathTF,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				265,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				21,
																				Short.MAX_VALUE)
																		.addComponent(
																				dScanBTN))
														.addComponent(
																jLabel3,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				208,
																				Short.MAX_VALUE)
																		.addComponent(
																				dDecodeBTN)))
										.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																dPathTF,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(dScanBTN))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																dDecodeBTN)
														.addComponent(jLabel4))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												228, Short.MAX_VALUE)
										.addContainerGap()));

		jTabbedPane1.addTab("\u89e3\u6790\u4e8c\u7ef4\u7801", jPanel2);
		
		dDecodeTA.setEnabled(false);
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(
						jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE,
						380, Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(
						jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE,
						356, Short.MAX_VALUE).addContainerGap()));
		


		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	//解码
	private void dDecodeBTNActionPerformed(java.awt.event.ActionEvent evt) {
		//解码
		if(path!=null && !path.equals("")){
			String deInfo = this.qc.decode(this.path);
			//弹窗
			
			//显示在文本域中
			this.dDecodeTA.setText(deInfo);
			
			MessageBox.showMessage("~~顾得~~!");
		}
//		this.path="E:\\test.png";
	}

	//解码前先选择文件
	private void dScanBTNActionPerformed(java.awt.event.ActionEvent evt) {
		setDChooser(dChooser);
		deResult = dChooser.showDialog(dPathTF, "确定");
		if(deResult==JFileChooser.APPROVE_OPTION){
			path = dChooser.getSelectedFile().getPath();
			dPathTF.setText(path);
			System.out.println("decode path = "+path);
		}else{
			System.out.println("未选择文件");
			MessageBox.showMessage("请您先选择文件.");
		}
	}

	//加码
	private void eGenBTNActionPerformed(java.awt.event.ActionEvent evt) {
		//加码
		if(!eInfoTF.getText().equals("")){
			info = eInfoTF.getText();
			if(!ePathTF.getText().equals("")){
				path = ePathTF.getText()+"\\test.png";
				dPathTF.setText(path);
				System.out.println("info = "+info+" path = "+path);
				
				if(info!=null && !info.equals("") && path!=null && !path.equals(null)){
					this.qc.encode(this.info, this.path);
				}
				
				//同时显示图片
				ePicPNL.setImage(new ImageIcon(path).getImage());
				ePicPNL.updateUI();
				
				MessageBox.showMessage("~~哦耶~~！");
			}else{
				MessageBox.showMessage("请您先选择生成二维码图片的位置哦,亲！");
			}
		}else{
			System.out.println("请输入加码信息");
			MessageBox.showMessage("请您输入要生成二维码的信息哦,亲！");
		}

//		this.path = "E:\\test.png";
	}

	//加码前先选择路径
	private void eScanBTNActionPerformed(java.awt.event.ActionEvent evt) {
		setEChooser(eChooser);
		enResult = eChooser.showDialog(ePathTF, "确定");
		if(enResult==JFileChooser.APPROVE_OPTION){
			path = eChooser.getSelectedFile().getPath();
			ePathTF.setText(path);
		
			System.out.println("encode path = "+path);
		}else{
			System.out.println("未选择目录");
			MessageBox.showMessage("请您选择生成二维码图片的位置哦,亲！");
		}
	}

	//设置选择生成目录对话框
	private void setEChooser(JFileChooser chooser) {
		chooser.setCurrentDirectory(new File("E:\\"));
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setSelectedFile(new File(""));
//		chooser.setFileFilter(new FileNameExtensionFilter("图片格式文件","gif","png","jpg","jpeg","bmp"));
	}
	
	//设置选择图片文件对话框
	private void setDChooser(JFileChooser chooser){
		chooser.setCurrentDirectory(new File("E:\\"));
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setSelectedFile(new File("test.png"));
		chooser.setFileFilter(new FileNameExtensionFilter("图片格式文件gif,png,jpg,jpeg,bmp","gif","png","jpg","jpeg","bmp"));
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
//					UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				StartFromHere x = new StartFromHere();
				SwingUtilities.updateComponentTreeUI(x);
				x.setTitle("二维码的生成和解码Demo V1.3.2");
				//居中
				double   width   =   Toolkit.getDefaultToolkit().getScreenSize().getWidth();   
		        double   height   =   Toolkit.getDefaultToolkit().getScreenSize().getHeight();   
		        x.setLocation(   (int)   (width   -   x.getWidth())   /   2,   
		                         (int)   (height   -   x.getHeight())   /   2);
		        x.setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton dDecodeBTN;
	private javax.swing.JTextArea dDecodeTA;
	private javax.swing.JTextField dPathTF;
	private javax.swing.JButton dScanBTN;
	private javax.swing.JButton eGenBTN;
	private javax.swing.JTextField eInfoTF;
	private javax.swing.JTextField ePathTF;
	private PanelToDisplayPic ePicPNL;
	private javax.swing.JButton eScanBTN;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTabbedPane jTabbedPane1;
	private JFileChooser eChooser;
	private JFileChooser dChooser;
	private int enResult;
	private int deResult;
	// End of variables declaration//GEN-END:variables

}