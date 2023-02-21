## Strategy Design Pattern
### Problem:
If the children on the parent class override the parent's methods,
and they share the same code, then there is no way to avoid code duplication. 

### Example:
`Vehicle` - Parent Class

`GoodsVehicle, PassengerVehicle, SportsVehicle` - Children class

GoodVehicle and SportVehicle share the same run method, but there is no way to avoid code duplication

`public void drive() {
        System.out.println("Special Drive");
}`