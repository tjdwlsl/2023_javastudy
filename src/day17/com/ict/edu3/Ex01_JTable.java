package day17.com.ict.edu3;

import javax.swing.table.AbstractTableModel;

//테이블을 만들기 위해서는 ABstracTableModel 상속받기

public class Ex01_JTable extends AbstractTableModel {

	// 1. 컬럼명(열의 대표적인 이름)
	String[] name = { "번호", "아이디", "패스워드", "나이", "성별" };

	String[][] data = { { "1", "aaaa", "a1111", "12", "true" }, { "2", "bbbb", "b1111", "13", "false" },
			{ "3", "cccc", "c1111", "14", "true" }, { "4", "dddd", "d1111", "15", "false" }, };

	// 행의 수 = row(줄)
	@Override
	public int getRowCount() {

		return data.length;
	}

	// 열의 수 = Column(칸)
	@Override
	public int getColumnCount() {

		return name.length;
	}

	// 내용 삾임 (행과 열의 인덱스 값)
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		return data[rowIndex][columnIndex];
	}

	// 컬럼명 넣기
	@Override
	public String getColumnName(int column) {

		return name[column];
	}

	// 내용 수정
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
			if (columnIndex != 0) {
				return true;
			}else {
				return false;
			}
		}

	// 고친내용 적용하기
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		if (columnIndex != 0) {
			data[rowIndex][columnIndex] = (String) aValue;
		}
	}

}
