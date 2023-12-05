var msg = 'Welcome to my room';

function greeting() {
    var elMsg = document.getElementById('greet')
    elMsg.textContent = msg;
}

greeting();

function size(width, height, prof) {
    var area = width * height;
    var sup = width * height * prof;
    var all = [area, sup];
    return all;

}
all = size(3, 5, 7);

var elArea = document.getElementById('area');
elArea.textContent = all[0];

var elSup = document.getElementById('sup');
elSup.textContent = all[1];


/*var hotel = {
    name: 'Secretos (Shhh)',
    rooms: 50,
    books: 30,

    checkAvaylability: function () {
        return this.rooms - this.books
    }
}

var elRooms = document.getElementById('rooms');
elRooms.textContent = hotel.rooms;

var elBooks = document.getElementById('books');
elBooks.textContent = hotel.books;

var elName = document.getElementById('hotelName');
elName.textContent = hotel.name;

var available = document.getElementById('availableRooms');
available.textContent = hotel.checkAvaylability();
*/

function Hotel(name, room, booked) {
    this.name = name;
    this.room = room;
    this.booked = booked;

    this.availablility = function () {
        return this.room - this.booked
    };
}

var hotelHeidi = new Hotel('Heidi', 50, 30);
var hotelSugar = new Hotel('Sugar', 80, 60);

console.log(hotelHeidi);
console.log(hotelSugar);

console.log(availablility())