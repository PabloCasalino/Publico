import "./App.css";
import "./style.css";


export default function App({ready}) {

 return <div className="card">

  <h1> Hola a todos</h1>
  <h2> que tal</h2>
  <span
    style= {ready ? {background: 'green'} : {background : 'red'} }>
  { ready ? 'Tarea realizada' : 'Tarea pendiente'}
  </span>

</div>

} ;

