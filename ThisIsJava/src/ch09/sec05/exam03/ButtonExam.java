package ch09.sec05.exam03;

public class ButtonExam {

	public static void main(String[] args) {
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다");
			}
		}
		btnOk.setClickListener(new OkListener());
		btnOk.click();
		
		Button btnCancle = new Button();
		
		class CancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 틀릭했습니다");
			}
		}
		btnCancle.setClickListener(new CancelListener());
		btnCancle.click();
	}

}
