import { useEffect, useState, useRef } from 'react';
import axios from 'axios';
import './App.css'; // Import CSS file

function App() {
	const [players, setPlayers] = useState([]);
	const tableContainerRef = useRef(null);

	useEffect(() => {
		fetchPlayers();
	}, []);

	const fetchPlayers = async () => {
		try {
			const response = await axios.get('http://localhost:8080/api/v1/player');
			console.log('Fetched data:', response.data);
			setPlayers(response.data);
		} catch (error) {
			console.error('Error fetching players:', error);
		}
	};

	// Scroll table left
	const scrollLeft = () => {
		if (tableContainerRef.current) {
			tableContainerRef.current.scrollBy({ left: -200, behavior: 'smooth' });
		}
	};

	// Scroll table right
	const scrollRight = () => {
		if (tableContainerRef.current) {
			tableContainerRef.current.scrollBy({ left: 200, behavior: 'smooth' });
		}
	};

	return (
		<div className="container">
			<h1>Premier League Player Stats</h1>
			<div className="table-wrapper">
				{/* Left Arrow Button */}
				<button className="scroll-button left" onClick={scrollLeft}>
					←
				</button>

				{/* Scrollable Table */}
				<div className="table-container" ref={tableContainerRef}>
					<table className="players-table">
						<thead>
							<tr>
								<th>Player Name</th>
								<th>Team</th>
								<th>Position</th>
								<th>Nation</th>
								<th>Age</th>
								<th>Matches</th>
								<th>Starts</th>
								<th>Minutes</th>
								<th>Goals</th>
								<th>Assists</th>
							</tr>
						</thead>
						<tbody>
							{players.length > 0 ? (
								players.map((player) => (
									<tr key={player.playerName}>
										<td>{player.playerName}</td>
										<td>{player.team}</td>
										<td>{player.position}</td>
										<td>{player.nation}</td>
										<td>{player.age}</td>
										<td>{player.mp}</td>
										<td>{player.starts}</td>
										<td>{player.min}</td>
										<td>{player.goals}</td>
										<td>{player.assists}</td>
									</tr>
								))
							) : (
								<tr>
									<td colSpan="10">No data available</td>
								</tr>
							)}
						</tbody>
					</table>
				</div>

				{/* Right Arrow Button */}
				<button className="scroll-button right" onClick={scrollRight}>
					→
				</button>
			</div>
		</div>
	);
}

export default App;
