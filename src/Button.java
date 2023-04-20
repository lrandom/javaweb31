public class Button {
    public void onClickListener(OnClickListener onClickListener) {
        onClickListener.onClick();
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.onClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Button clicked");
            }
        });

        Button button1 = new Button();
        button1.onClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Button 1 clicked");
            }
        });
    }
}
