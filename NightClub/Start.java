public class Start{
	public static void main(String[] args){
		Service services=new Service("224323",50000,5);
		NightClub nightclub0=new NightClub("Pranto Goswamee","224323","19","Male","01782379832");
		NightClub nightclub1=new NightClub("Hamonto Mondal","223423","21","Male","01928379832");
		services.AddCustomer(nightclub0);
		services.AddCustomer(nightclub1);
		services.ShowAllInfo();
		services.DeleteCustomerData(nightclub1);
		services.ShowAllInfo();
		services.SearchingForPayment("223423");
	}
}