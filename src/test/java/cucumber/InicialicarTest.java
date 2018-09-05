/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cucumber;

import cofre.CofrePM;
import cofre.Memoria;
import cofre.SensorPorta;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InicialicarTest {

    Memoria memoriaMock = mock(Memoria.class);
    SensorPorta sensorMock = mock(SensorPorta.class);
    CofrePM c = new CofrePM(sensorMock, memoriaMock);

    String senha = "581265";

    @Given("que eu entrei com {int} digitos")
    public void entrei_senha_valida() {
        assertEquals("Entre com a senha 6 digitos", c.getDisplay());
    }

    @When("eu realizei a abertura da porta")
    public void destravar(String senha) {
        this.senha = senha;
    }

    @Then("o resultado deve ser a mensagem {string}")
    public void mensagem() {
        c.ok();
        //assertEquals("senha correta. Cofre aberto", );
    }

}


/*

When("eu realizei a abertura da porta") do
  pending # Write code here that turns the phrase above into concrete actions
end

Then("o resultado deve ser a mensagem {string}") do |string|
  pending # Write code here that turns the phrase above into concrete actions
end*/
