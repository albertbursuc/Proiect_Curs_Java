package sci.travel_app.WalkTheBear.service;

import sci.travel_app.WalkTheBear.model.entities.Place;
import sci.travel_app.WalkTheBear.model.misc.Category;

import java.util.List;

public interface PlacesService {
    Place getPlaceById(long placeId);
    List<Place>  getPlaceByName(String name);
    List<Place> getAllPlaces();
    List<Place> getPlaceByCategory(Category category);
    void addPlace(Place place);
    void updatePlace(Place place);
    void deletePlace(long placeId);
}
