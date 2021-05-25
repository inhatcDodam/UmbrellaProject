package main.umReturn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFormattedTextField.AbstractFormatter;

import net.sourceforge.jdatepicker.impl.JDatePickerImpl;

public class DateLabelFormatter extends AbstractFormatter {

	
	private String datePattern = "yyyy-MM-dd";
	private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);
	
	@Override
	public Object stringToValue(String text) throws ParseException {
		
		return dateFormatter.parseObject(text);
	}

	// 날짜 클릭 시 텍스트 필드에 클릭된 날짜 출력
	@Override
	public String valueToString(Object value) throws ParseException {
		if(value != null) {
			Calendar cal = (Calendar)value;
			return dateFormatter.format(cal.getTime());
		}
		return "";
	}
	

}
