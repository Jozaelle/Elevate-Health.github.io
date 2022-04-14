package com.techelevator.dao;

import com.techelevator.model.Hydration;

import java.util.List;

public interface HydrationDao {

    // get all hydration by id
    List<Hydration> getAllHydration(int user_id);

    // create hydration
    void createHydration(Hydration hydrationToCreate);
}
