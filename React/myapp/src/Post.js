



export const Posts = () => {

    return <button onClick={() => {
        fetch('https://jsonplaceholder.org/useres')
        .then(response => response.json())
        .then(data => console.log(data))
        .catch(error => console.log('Problemas con el json'))
    }}>
<VscOctoface/>
 Traer Datos       
    </button>
};
