const placeContainer = document.getElementsByClassName('place-container')[0];
const morePagesBtn = document.getElementsByClassName('morePagesBtn')[0];

const BASE_URL = 'http://localhost:8080/'

async function _getAllPlaces() {
    const url = BASE_URL + "findAllPlaces/0/5";
    const response = await axios.get(url);
    if (response.status !== 200) {
        throw new Error(response.status);
    }
    console.log(response.data.content)
    return response.data.content;
}

async function _getMorePlaces() {
    const url = BASE_URL + "findAllPlaces/1/5";
    const response = await axios.get(url);
    if (response.status !== 200) {
        throw new Error(response.status);
    }
    console.log(response.data.content)
    return response.data.content;
}
async function renderMorePlaces() {
    const places = await _getMorePlaces();
    addMoreToPagePlaces(places)
}

async function renderPlaces() {
  const places = await _getAllPlaces();
  addToPagePlaces(places)
}
const addMoreToPagePlaces = (places) => {

    places.forEach(async (place) => {
        const placeTemplate = `
        <div class="card" style="width: 16rem;">
            <div class="card-body">
                <img src="${place.image}" alt=""style="width: 14rem; height: 10rem">
                <a href="#" class="card-link">${place.name}</a>
            </div>
        </div>`
        placeContainer.insertAdjacentHTML('beforeend', placeTemplate);
    });
};
const addToPagePlaces = (places) => {
    
    places.forEach(async (place) => {
        const placeTemplate = `
        <div div class = "card my-2" style = "width: 16rem;">
            <div class="card-body">
                <img src="${place.image}" alt=""style="width: 14rem; height: 10rem">
                <a href="#" class="card-link">${place.name}</a>
            </div>
        </div>`
        placeContainer.insertAdjacentHTML('beforeend', placeTemplate);
    });
};
morePagesBtn.addEventListener("click", () => { renderMorePlaces() });
window.addEventListener("DOMContentLoaded", renderPlaces());
