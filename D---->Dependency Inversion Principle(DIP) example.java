public class orderService{
  private final DbService dbServicr;
  private OrderService (DbService dbService) {
    this.dbService.dbService;
  }
}

public class MySqlDbService implements DbService {
  public void save(){
    System.out.println("Saving data to MySQL datavase...");
  }
}
