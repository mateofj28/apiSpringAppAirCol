package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Avion;
import com.example.demo.service.IAvion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/avion")
@CrossOrigin(origins = "http://localhost:51094")
public class controlAvion {
    
    @Autowired
    private IAvion restAvion;

    @RequestMapping(value = "/id", method = RequestMethod.GET, produces = "application/json")
    public Avion getAvion(@RequestParam(value = "id") int id){
        return restAvion.findAvionById(id);
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Avion> getAviones(){
        return restAvion.findAll();
    }

    
}


/**Widget build(BuildContext context) {
    return SizedBox(
      width: double.infinity,
      child: DataTable(
        columns: const <DataColumn>[
          DataColumn(
            label: Text('Number'),
          ),
        ],
        rows: List<DataRow>.generate(
          numItems,
          (int index) => DataRow(
            color: MaterialStateProperty.resolveWith<Color?>(
                (Set<MaterialState> states) {
              // All rows will have the same selected color.
              if (states.contains(MaterialState.selected))
                return Theme.of(context).colorScheme.primary.withOpacity(0.08);
              // Even rows will have a grey color.
              if (index.isEven) {
                return Colors.grey.withOpacity(0.3);
              }
              return null; // Use default value for other states and odd rows.
            }),
            cells: <DataCell>[DataCell(Text('Row $index'))],
            selected: selected[index],
            onSelectChanged: (bool? value) {
              setState(() {
                selected[index] = value!;
              });
            },
          ),
        ),
      ),
    );
  }
}
 */


