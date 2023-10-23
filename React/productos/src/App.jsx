import "./App.css";
import Header from "./components/Header";
import Footer from "./components/Footer";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Productos from "./components/Productos";
import useProducto from "./hooks/useProducto";

function App() {
  const{productos, favoritos, agregarFavoritos, eliminarFavoritos} = useProducto()
  return (
    <BrowserRouter>
      <Header />
       <Routes>
        <Route path="/" element={ <Productos producto ={productos} eliminarFavoritos={eliminarFavoritos} agregarFavoritos={agregarFavoritos}/>} />
        <Route path="/favoritos" element={ <Productos producto ={favoritos} eliminarFavoritos={eliminarFavoritos} agregarFavoritos={agregarFavoritos}/>} />
       </Routes>
      <Footer />
    </BrowserRouter>
  );
}

export default App;
