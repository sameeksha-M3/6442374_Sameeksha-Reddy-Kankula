// 1. Setup
console.log("Welcome to the Community Portal");
window.onload = () => alert("Page loaded!");

// 2. Data Types
const event1 = { name: "Music Night", date: "2025-06-01", seats: 5, category: "Music" };
const event2 = { name: "Baking Workshop", date: "2025-06-05", seats: 0, category: "Workshop" };
const event3 = { name: "Tech Seminar", date: "2024-12-01", seats: 10, category: "Seminar" };
let events = [event1, event2, event3];

// 3. Filter & Display
function isFuture(date) {
  return new Date(date) > new Date();
}

function displayEvents(eventsToShow) {
  const container = document.getElementById("eventsContainer");
  container.innerHTML = "";
  eventsToShow.forEach(ev => {
    if (isFuture(ev.date) && ev.seats > 0) {
      const div = document.createElement("div");
      div.className = "event-card";
      div.innerHTML = `
        <h3>${ev.name}</h3>
        <p>Date: ${ev.date}</p>
        <p>Seats: ${ev.seats}</p>
        <p>Category: ${ev.category}</p>
      `;
      container.appendChild(div);
    }
  });
}
displayEvents(events);

// 4. Functions & Closures
function registerUser(name, email, eventName) {
  const event = events.find(e => e.name === eventName);
  try {
    if (event.seats > 0) {
      event.seats--;
      console.log(`${name} registered for ${eventName}`);
    } else {
      throw new Error("No seats left");
    }
  } catch (err) {
    console.error(err.message);
  }
}

// Closure to track registration counts by category
function categoryTracker() {
  const counts = {};
  return function (category) {
    counts[category] = (counts[category] || 0) + 1;
    return counts[category];
  };
}
const trackCategory = categoryTracker();

// 5. Classes & Prototypes
class Event {
  constructor(name, date, seats, category) {
    this.name = name;
    this.date = date;
    this.seats = seats;
    this.category = category;
  }
}
Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};

// 6. Arrays
const eventNames = events.map(e => e.name);

// 7. DOM Manipulation
const eventDropdown = document.forms[0].elements.eventName;
events.forEach(e => {
  const option = document.createElement("option");
  option.value = e.name;
  option.text = e.name;
  eventDropdown.add(option);
});

// 8. Event Handling
document.getElementById("categoryFilter").onchange = (e) => {
  const value = e.target.value;
  const filtered = value === "All" ? events : events.filter(ev => ev.category === value);
  displayEvents(filtered);
};

document.getElementById("searchBox").onkeydown = (e) => {
  const query = e.target.value.toLowerCase();
  const results = events.filter(ev => ev.name.toLowerCase().includes(query));
  displayEvents(results);
};

// 9. Async JS
async function fetchEvents() {
  document.getElementById("eventsContainer").innerHTML = "Loading...";
  try {
    const res = await fetch("https://jsonplaceholder.typicode.com/posts");
    const data = await res.json();
    console.log("Mock events fetched", data.slice(0, 3));
  } catch (err) {
    console.error("Failed to fetch events");
  }
}
fetchEvents();

// 10. Modern JS
const logEvent = ({ name, date }) => console.log(`Event: ${name} on ${date}`);

// 11. Form Handling
document.getElementById("registrationForm").addEventListener("submit", function (e) {
  e.preventDefault();
  const name = this.elements.name.value;
  const email = this.elements.email.value;
  const eventName = this.elements.eventName.value;

  if (!name || !email || !eventName) {
    document.getElementById("formMsg").innerText = "All fields are required.";
    return;
  }

  registerUser(name, email, eventName);
  document.getElementById("formMsg").innerText = "Successfully registered!";
});

// 12. AJAX Simulated
function mockSubmit(data) {
  return new Promise((resolve) => {
    setTimeout(() => resolve("Registered on server"), 2000);
  });
}

// 13. Debugging
// Use Chrome DevTools to inspect values below
console.log("Form ready, waiting for submit");

// 14. jQuery + Fade
$('#registerBtn').click(function () {
  $('#formMsg').fadeOut(100).fadeIn(100).text("Clicked!");
});
