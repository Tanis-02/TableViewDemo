package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

  @FXML
  private TableView<Person> tvPeople;

  @FXML
  private TableColumn<Person, String> colFirstName;

  @FXML
  private TableColumn<Person, String> colLastName;

  private ObservableList<Person> people;

  public void initialize(){

    people = FXCollections.observableArrayList();

    colFirstName.setCellValueFactory(new PropertyValueFactory("firstName"));
    colLastName.setCellValueFactory(new PropertyValueFactory("lastName"));

    tvPeople.setItems(people);
    addPerson();
    addPerson();
  }

  public void addPerson() {
    people.add(new Person("Damien", "Smith"));
    people.add(new Person("Nicolas", "Gonzalez"));
    people.add(new Person("Ninten", "Rough"));
    people.add(new Person("Harold", "James"));
  }

}