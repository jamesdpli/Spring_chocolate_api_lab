package com.bnta.chocolate.components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component //Let spring know this class is a component, do not forget to implement ApplicationRunner below
public class DataLoader implements ApplicationRunner{

    @Autowired
    ChocolateRepository chocolateRepository;

    @Autowired
    EstateRepository estateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{

        Estate estate1 = new Estate("Chocolate Mint","Zambia");
        estateRepository.save(estate1);

        Chocolate chocolate1 = new Chocolate("Wispa",40,estate1);
        chocolateRepository.save(chocolate1);

        Chocolate chocolate2 = new Chocolate("Flake",65,estate1);
        chocolateRepository.save(chocolate2);

        Chocolate chocolate3 = new Chocolate("Twirl",80,estate1);
        chocolateRepository.save(chocolate3);

        Chocolate chocolate4 = new Chocolate("Dairy Milk",95,estate1);
        chocolateRepository.save(chocolate4);

        Chocolate chocolate5 = new Chocolate("Lion Bar",5,estate1);
        chocolateRepository.save(chocolate5);

        Estate estate2 = new Estate("Chocolate Factory","Oman");
        estateRepository.save(estate2);

        Chocolate chocolate6 = new Chocolate("Cream Egg",20,estate2);
        chocolateRepository.save(chocolate6);

        Chocolate chocolate7 = new Chocolate("Freddo",100,estate2);
        chocolateRepository.save(chocolate7);

        Chocolate chocolate8 = new Chocolate("Mars Bar",22,estate2);
        chocolateRepository.save(chocolate8);

        Chocolate chocolate9 = new Chocolate("Snickers",30,estate2);
        chocolateRepository.save(chocolate9);

        Chocolate chocolate10 = new Chocolate("Bounty",1,estate2);
        chocolateRepository.save(chocolate10);
    }
}
