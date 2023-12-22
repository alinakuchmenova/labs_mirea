public class Phone {
    String phone = "";
    Phone(String phone){
        if(phone.charAt(0)=='8'){
            this.phone="+7"+phone.substring(1, 4)+"-"+phone.substring(4,7)+"-"+phone.substring(7);
        }
        else if (phone.length()==12){
            this.phone=phone.substring(0,5)+"-"+phone.substring(5,8)+"-"+phone.substring(8);
        }
        else this.phone=phone.substring(0,6)+"-"+phone.substring(6,9)+"-"+phone.substring(9);
    }

    @Override
    public String toString() {
        return phone;
    }
}
